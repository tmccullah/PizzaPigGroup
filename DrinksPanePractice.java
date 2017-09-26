import javafx.geometry.Insets;
import javafx.scene.control.Button;

import java.util.ArrayList;
// import JavaFX package with its subpackages and classes & ArrayList class from util package


/******************************************************************************************************

NAME: Tori McCullah

DATE: 09/11/2017

******************************************************************************************************/


public class DrinksPanePractice extends Pane {

   // grid pane will organize buttons in an ordered fashion
   private GridPane grid = new GridPane();
   private HBox hBox = new HBox();
   
   // array list will store all the toppings selected
   private ArrayList<String> drinksList = new ArrayList<>();
   
   // create buttons for all the topping choices
   private Button water = new Button("bottled water"); 
   private Button coke = new Button("regular coke"); 
   private Button diet = new Button("diet coke"); 
   private Button sprite = new Button("sprite");  
   private Button mrPibb = new Button("Mr. Pibb"); 
   private Button powerade = new Button("powerade 1L bottle"); 
   private Button twoLiter = new Button("2 Liter Soda"); 
   private Button sodaCan = new Button("Individual Soda");
   
   
   // establish contructor   
   public DrinksPanePractice() {
   
      buttonStyle(water);
      buttonStyle(powerade);
      buttonStyle(twoLiter);
      buttonStyle(sodaCan); 
      buttonStyle(coke);
      buttonStyle(diet);
      buttonStyle(sprite);
      buttonStyle(mrPibb);
      
      activateButtons();
      
   // set button styles and add these four buttons to grid on first row
      grid.addRow(0, water, powerade, twoLiter, sodaCan);  
      grid.addRow(1, coke, diet, sprite, mrPibb);
      grid.setPadding(new Insets(30, 30, 30, 30)); 
      grid.setHgap(20);
      grid.setVgap(20);  
      
      
      water.setOnAction( e -> { 
         drinksList.add("bottledWater"); 
         water.setDisable(true);
         turnOffSodaChoices();
      }); 
      
      
      powerade.setOnAction( e -> { 
         drinksList.add("powerade"); 
         powerade.setDisable(true);
         turnOffSodaChoices();
      }); 
     
      
      twoLiter.setOnAction( e -> { 
         drinksList.add("2-Liter");
         turnOffDrinkChoices();
         turnOnSodaChoices();
         sodaType();
      });
      
      
      sodaCan.setOnAction( e -> {
         drinksList.add("sodaCan");
         turnOffDrinkChoices();
         turnOnSodaChoices();
         sodaType();
      });
        
          
      getChildren().add(grid);
   }

   
   public ArrayList getDrinksList() {
      return drinksList;
   }

   
   private void buttonStyle(Button button) {
      button.setStyle(
         "-fx-font: 22px Silom; -fx-base: #b6e7c9; -fx-min-width: 150px; -fx-min-height: 100px;" 
         + " -fx-background-radius: 15em; -fx-max-width: 150px; -fx-max-height: 100px;"
      );
   } 

 

   private void sodaType() {
// add the soda selected to list then disable button usage
   
      coke.setOnAction( e -> { 
         drinksList.add("\tcoke"); 
         coke.setDisable(true); 
      });
      
      diet.setOnAction( e -> { 
         drinksList.add("\tdiet"); 
         diet.setDisable(true); 
      }); 
      
      sprite.setOnAction( e -> { 
         drinksList.add("\tsprite"); 
         sprite.setDisable(true); 
      });
      
      mrPibb.setOnAction( e -> { 
         drinksList.add("\tmrPibb"); 
         mrPibb.setDisable(true); 
      }); 
   }
   
   
   public void activateButtons() {
      water.setDisable(false);
      powerade.setDisable(false);
      twoLiter.setDisable(false);
      sodaCan.setDisable(false);
      turnOffSodaChoices();
   }

// soda choices disactivated
   public void turnOffSodaChoices() {
      coke.setDisable(true);
      diet.setDisable(true);
      sprite.setDisable(true);
      mrPibb.setDisable(true);
   }
 
// soda choices activated for choosing   
   public void turnOnSodaChoices() {
      coke.setDisable(false);
      diet.setDisable(false);
      sprite.setDisable(false);
      mrPibb.setDisable(false);
   }
   
   
   public void turnOffDrinkChoices() {
      water.setDisable(true);
      powerade.setDisable(true);
      twoLiter.setDisable(true);
      sodaCan.setDisable(true);
   }
         
}