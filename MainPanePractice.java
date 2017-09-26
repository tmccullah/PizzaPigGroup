import javafx.geometry.Insets;
import javafx.scene.control.Button;
// import JavaFX package with its subpackages and classes & ArrayList class from util package


/******************************************************************************************************

NAME: Tori McCullah

DATE: 09/11/2017

******************************************************************************************************/


public class MainPanePractice extends Pane {

   // grid pane will organize buttons in an ordered fashion
   private GridPane grid = new GridPane();
   
   protected Button pizzaSize = new Button("Size"); // size button created
   protected Button crust = new Button("Crust"); // crust button created
   protected Button toppings = new Button("Toppings"); // toppings button created
   protected Button drinks = new Button("Drinks"); // drinks button created
   protected Button back = new Button("BACK"); //back button
   protected Button pizza = new Button("Pizza");
   
   
// establish contructor   
   public MainPanePractice() {
   
   // format buttons
      buttonStyle(pizzaSize);
      buttonStyle(crust);
      buttonStyle(toppings);
      buttonStyle(drinks);
      buttonStyle(pizza);
      
      deactivatePizzaOptions();
      
      back.setStyle(
         "-fx-font: 22px Silom; -fx-base: #DD55CC; -fx-pref-width: 150px; -fx-pref-height: 90px;"
      );

   // add buttons to grid
      grid.addRow(0, pizza, pizzaSize, crust, toppings, drinks, back);
      grid.setPadding(new Insets(30, 30, 30, 30));
      grid.setHgap(20);
      grid.setVgap(20);
      
      getChildren().add(grid);
   }

   
   private void buttonStyle(Button button) {
      button.setStyle(
         "-fx-font: 22px Silom; -fx-base: #b6e7c9; -fx-pref-width: 150px; -fx-pref-height: 90px;"
      );
   }

// to activate buttons   
   public void activateButtons() { 
      pizza.setDisable(false);
      drinks.setDisable(false);
   }
   
   
   public void deactivatePizzaOptions() {
      pizzaSize.setDisable(true);
      crust.setDisable(true);
      toppings.setDisable(true);
   }
       
}