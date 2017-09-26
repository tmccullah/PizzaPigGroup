import javafx.geometry.Insets;
import javafx.scene.control.Button;

import java.util.ArrayList;
// import JavaFX package with its subpackages and classes & ArrayList class from util package


/******************************************************************************************************

NAME: Tori McCullah

DATE: 09/08/2017

******************************************************************************************************/


public class ToppingsPanePractice extends Pane {

   // grid pane will organize buttons in an ordered fashion
   private GridPane grid = new GridPane();
   
   // array list will store all the toppings selected
   private ArrayList<String> toppingsList = new ArrayList<>();
   
   // create buttons for all the topping choices
   private Button extraCheese = new Button("extra cheese"); 
   private Button extraSauce = new Button("extra sauce"); 
   private Button pepperoni = new Button("pepperoni"); 
   private Button mushrooms = new Button("mushrooms");  
   private Button olives = new Button("olives"); 
   private Button italianSausage = new Button("italian sausage"); 
   private Button chicken = new Button("chicken"); 
   private Button anchovies = new Button("anchovies"); 
   private Button spinach = new Button("spinach"); 
   private Button artichokes = new Button("artichokes"); 
   private Button greenBellPepper = new Button("green bell pepper");
   private Button sunDriedTomatoes = new Button("sun dried tomatoes"); 
   private Button pineapple = new Button("pineapple"); 
   private Button ham = new Button("ham"); 
   private Button bacon = new Button("bacon"); 
   protected Button done = new Button("DONE");
   
   
   // establish contructor   
   public ToppingsPanePractice() {
   
      buttonStyle(extraCheese);
      buttonStyle(extraSauce);
      buttonStyle(pepperoni);
      buttonStyle(mushrooms);
   // set button styles and add these four buttons to grid on first row
      grid.addRow(0, extraCheese, extraSauce, pepperoni, mushrooms);
      
      buttonStyle(italianSausage);
      buttonStyle(chicken);
      buttonStyle(anchovies);
      buttonStyle(spinach);
   // set button styles and add these four buttons to grid on second row     
      grid.addRow(1, italianSausage, chicken, anchovies, spinach);
      
      buttonStyle(greenBellPepper);
      buttonStyle(sunDriedTomatoes);
      buttonStyle(pineapple);
      buttonStyle(ham);
   // set button styles and add these four buttons to grid on third row  
      grid.addRow(2, greenBellPepper, sunDriedTomatoes, pineapple, ham);
      
                  
      buttonStyle(olives);
      buttonStyle(artichokes);
      buttonStyle(bacon);
      buttonStyle(done);
      
      done.setStyle(
         "-fx-font: 22px Silom; -fx-base: #b6e7c9; -fx-min-width: 150px; -fx-min-height: 100px;" 
         + " -fx-background-radius: 15em; -fx-max-width: 150px; -fx-max-height: 100px;"
      );
         
   // set button styles and add these three buttons to grid on fourth row
      grid.addRow(3, olives, artichokes, bacon, done);
      
      
      extraCheese.setOnAction( e -> {
         toppingsList.add("extraCheese");
         extraCheese.setDisable(true);
      }); 
      
      extraSauce.setOnAction( e -> {
         toppingsList.add("extraSauce");
         extraSauce.setDisable(true);
      }); 
      
      pepperoni.setOnAction( e -> {
         toppingsList.add("pepperoni");
         pepperoni.setDisable(true);
      });
      
      mushrooms.setOnAction( e -> {
         toppingsList.add("mushrooms");
         mushrooms.setDisable(true);
      });
      
      olives.setOnAction( e -> {
         toppingsList.add("olives");
         olives.setDisable(true);
      });
      
      italianSausage.setOnAction( e -> {
         toppingsList.add("italianSausage");
         italianSausage.setDisable(true);
      }); 
      
      chicken.setOnAction( e -> {
         toppingsList.add("chicken");
         chicken.setDisable(true);
      });
      
      anchovies.setOnAction( e -> {
         toppingsList.add("anchovies"); 
         anchovies.setDisable(true);
      }); 
      
      spinach.setOnAction( e -> {
         toppingsList.add("spinach");
         spinach.setDisable(true);
      });
      
      artichokes.setOnAction( e -> {
         toppingsList.add("artichokes");
         artichokes.setDisable(true);
      });
      
      greenBellPepper.setOnAction( e -> {
         toppingsList.add("greenBellPepper");
         greenBellPepper.setDisable(true);
      });
      
      sunDriedTomatoes.setOnAction( e -> {
         toppingsList.add("sunDriedTomatoes");
         sunDriedTomatoes.setDisable(true);
      });
      
      pineapple.setOnAction( e -> { 
         toppingsList.add("pineapple"); 
         pineapple.setDisable(true);
      });
      
      ham.setOnAction( e -> {
         toppingsList.add("ham");
         ham.setDisable(true);
      });
      
      bacon.setOnAction( e -> {
         toppingsList.add("bacon");
         bacon.setDisable(true);
      });
      
      grid.setPadding(new Insets(30, 30, 30, 30)); 
      grid.setHgap(20);
      grid.setVgap(20);
      
      getChildren().add(grid);
   }
   
   public ArrayList getToppingsList() {
      return toppingsList;
   }
   
   public void resetToppingsList() {
      toppingsList.clear();
   }
   
   private void buttonStyle(Button button) {
      button.setStyle(
         "-fx-font: 22px Silom; -fx-base: #b6e7c9; -fx-min-width: 150px; -fx-min-height: 100px;" 
         + " -fx-background-radius: 15em; -fx-max-width: 150px; -fx-max-height: 100px;"
      );
   }
   
   public void activateButtons() {
      extraCheese.setDisable(false);
      extraSauce.setDisable(false);
      pepperoni.setDisable(false);
      mushrooms.setDisable(false);
      olives.setDisable(false);
      italianSausage.setDisable(false);
      chicken.setDisable(false);
      anchovies.setDisable(false);
      spinach.setDisable(false);
      artichokes.setDisable(false);
      greenBellPepper.setDisable(false);
      sunDriedTomatoes.setDisable(false);
      pineapple.setDisable(false);
      ham.setDisable(false);
      bacon.setDisable(false);
   }
   
   
   public void deactivateButtons() {
      extraCheese.setDisable(true);
      extraSauce.setDisable(true);
      pepperoni.setDisable(true);
      mushrooms.setDisable(true);
      olives.setDisable(true);
      italianSausage.setDisable(true);
      chicken.setDisable(true);
      anchovies.setDisable(true);
      spinach.setDisable(true);
      artichokes.setDisable(true);
      greenBellPepper.setDisable(true);
      sunDriedTomatoes.setDisable(true);
      pineapple.setDisable(true);
      ham.setDisable(true);
      bacon.setDisable(true);
   }
       
}