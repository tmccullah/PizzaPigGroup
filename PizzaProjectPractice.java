package pizza_pos;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

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
   
   RecieptPanePractice receipt = new RecieptPanePractice();
   

   @Override
   public void start(Stage stage) {

	   
      
      mainPane.pizza.setOnAction( e -> {
         receipt.enterText("\nPIZZA: ");
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
         receipt.enterText("\n\tsize\n\t\t" + sizePane.getSize());
         
         mainPane.crust.setDisable(true);
         mainPane.toppings.setDisable(false);
      // change center panel to crust
         borderPane.setCenter(crustPane);
      });
      

      mainPane.toppings.setOnAction( e -> {
         receipt.enterText("\n\tcrust\n\t\t" + crustPane.getCrust());
         receipt.enterText("\n\ttoppings");
         
         mainPane.toppings.setDisable(true);
      // change center panel to toppings
         borderPane.setCenter(toppingsPane);
      });
      
      
      toppingsPane.done.setOnAction( e -> {
         toppingsPane.done.setDisable(true);
         toppingsPane.deactivateButtons();
         
         if (toppingsPane.getToppingsList().size() == 0)
            receipt.enterText("\n\t\t[NONE]");
         else
            for (Object top: toppingsPane.getToppingsList())
               receipt.enterText("\n\t\t" + top);
         
         toppingsPane.resetToppingsList();
      });
      

      mainPane.drinks.setOnAction( e -> {
         mainPane.crust.setDisable(true);
         mainPane.toppings.setDisable(true);
         mainPane.pizzaSize.setDisable(true);

      // change center panel to drinks
         borderPane.setCenter(drinkPane);
         
         receipt.enterText("\ndrinks");
      // for loop will find all the drinks selected and append to receipt
         for (Object drink: drinkPane.getDrinksList())
            receipt.enterText("\n\t" + drink);  
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
      
      
      
   // add text area, receipt, and its label to vBox & change receipt's shape (long rectangle)
      vBox.getChildren().add(receipt);
      vBox.setPrefWidth(300);    

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