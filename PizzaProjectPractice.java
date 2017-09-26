import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.Stage;

// import necessary packages (javafx) with its subpackages and classes

/******************************************************************************************************

NAME: Tori McCullah

DATE: 09/08/2017

******************************************************************************************************/




public class PizzaProjectPractice extends Application {
  
   StackPane stackPane = new StackPane();
   VBox vBox = new VBox();
   BorderPane borderPane = new BorderPane();
   
// initialize panes
   MainPanePractice mainPane = new MainPanePractice();
   ToppingsPanePractice toppingsPane = new ToppingsPanePractice();
   CrustPanePractice crustPane = new CrustPanePractice();
   DrinksPanePractice drinkPane = new DrinksPanePractice();
   SizePanePractice sizePane = new SizePanePractice();


   @Override
   public void start(Stage stage) {

   // create new receipt text field that will not be editable
      TextArea receipt = new TextArea("");
      receipt.setFont(Font.font("Lucida Grande", 12));
      receipt.setEditable(false);
      
      mainPane.pizza.setOnAction( e -> {
         receipt.appendText("\nPIZZA: ");
         mainPane.drinks.setDisable(true);
         mainPane.pizza.setDisable(true);
         mainPane.pizzaSize.setDisable(false);
      });
      
      
      mainPane.pizzaSize.setOnAction( e -> {
         mainPane.pizzaSize.setDisable(true);
         mainPane.crust.setDisable(false);
      // change center panel to size
         borderPane.setCenter(sizePane);  
      }); 
      

      mainPane.crust.setOnAction( e -> {
         receipt.appendText("\n\tsize\n\t\t" + sizePane.getSize());
         
         mainPane.crust.setDisable(true);
         mainPane.toppings.setDisable(false);
      // change center panel to crust
         borderPane.setCenter(crustPane);
      });
      

      mainPane.toppings.setOnAction( e -> {
         receipt.appendText("\n\tcrust\n\t\t" + crustPane.getCrust());
         receipt.appendText("\n\ttoppings");
         
         mainPane.toppings.setDisable(true);
      // change center panel to toppings
         borderPane.setCenter(toppingsPane);
      });
      
      
      toppingsPane.done.setOnAction( e -> {
         toppingsPane.done.setDisable(true);
         toppingsPane.deactivateButtons();
         
         if (toppingsPane.getToppingsList().size() == 0)
            receipt.appendText("\n\t\t[NONE]");
         else
            for (Object top: toppingsPane.getToppingsList())
               receipt.appendText("\n\t\t" + top);
         
         toppingsPane.resetToppingsList();
      });
      

      mainPane.drinks.setOnAction( e -> {
         mainPane.crust.setDisable(true);
         mainPane.toppings.setDisable(true);
         mainPane.pizzaSize.setDisable(true);

      // change center panel to drinks
         borderPane.setCenter(drinkPane);
         
         receipt.appendText("\ndrinks");
      // for loop will find all the drinks selected and append to receipt
         for (Object drink: drinkPane.getDrinksList())
            receipt.appendText("\n\t" + drink);  
      });
      
      
      
      
      mainPane.back.setOnAction( e-> { 
         borderPane.setCenter(stackPane); 
         mainPane.activateButtons();
         mainPane.deactivatePizzaOptions();
         toppingsPane.activateButtons();
         drinkPane.activateButtons();
         crustPane.activateButtons();
         sizePane.activateButtons();
         toppingsPane.done.setDisable(false);
      });
      
      
   // create a label with text that is white, size 12, font is Lucida Grande
      Label receiptLbl = new Label("Items: \n\n\n");
      receiptLbl.setFont(Font.font("Lucida Grande", 12));
      receiptLbl.setStyle("-fx-text-fill: white");
      
   // add text area, receipt, and its label to vBox & change receipt's shape (long rectangle)
      vBox.getChildren().addAll(receiptLbl, receipt);
      vBox.setPrefWidth(300);
      receipt.setPrefRowCount(500);     

      borderPane.setLeft(vBox);
      borderPane.setBottom(mainPane);
      borderPane.setAlignment(vBox, Pos.CENTER);
      borderPane.setAlignment(mainPane, Pos.CENTER);
      borderPane.setPadding(new Insets(15, 15, 15, 15));
      borderPane.setStyle("-fx-background-color: #003333;");
      
      Scene scene = new Scene(borderPane, 1100, 700); // add border pane to scene
      stage.setScene(scene); // set scene on the stage
      stage.setTitle("Pizza Practice"); // set title for stage
      stage.show(); // display stage
      
   }
   
   
   
   
   
   public static void main(String[] args) {
      Application.launch();
   } // launch application of pizza practice  
   
}