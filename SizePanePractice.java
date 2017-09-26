import javafx.geometry.Insets;
import javafx.scene.control.Button;

// import JavaFX package with its subpackages and classes & ArrayList class from util package


/******************************************************************************************************

NAME: Tori McCullah

DATE: 09/11/2017

******************************************************************************************************/


public class SizePanePractice extends Pane {

   // grid pane will organize buttons in an ordered fashion
   private GridPane grid = new GridPane();
   
   // array list will store all the size selected
   private String size = "";
   
   // create buttons for all the size choices
   private Button small = new Button("small"); 
   private Button medium = new Button("medium"); 
   private Button large = new Button("large"); 
   
   // establish contructor   
   public SizePanePractice() {
   
   // format then add buttons to grid
      buttonStyle(small);
      buttonStyle(medium);
      buttonStyle(large);
      
      grid.addRow(0, small, medium, large);
      
      grid.setPadding(new Insets(30, 30, 30, 30));
      grid.setHgap(20);
      
   // on mouse clicks, button selected is appeneded to list
      small.setOnAction( e -> { 
         size = "small"; 
         deactivateButtons();
      }); 
      
      medium.setOnAction( e -> { 
         size = "medium"; 
         deactivateButtons();
      }); 
      
      large.setOnAction( e -> {
         size = "large"; 
         deactivateButtons();
      });
      
      getChildren().add(grid);
   }
   
   public String getSize() {
      return size;
   }
   
   private void buttonStyle(Button button) {
     button.setStyle(
         "-fx-font: 22px Silom; -fx-base: #b6e7c9; -fx-min-width: 150px; -fx-min-height: 100px;" 
         + " -fx-background-radius: 15em; -fx-max-width: 150px; -fx-max-height: 100px;"
      );
   }
   
// method to activate buttons
   public void activateButtons() {
      small.setDisable(false);
      medium.setDisable(false);
      large.setDisable(false);
   }
   
   public void deactivateButtons() {
      small.setDisable(true);
      medium.setDisable(true);
      large.setDisable(true);
   }
       
}