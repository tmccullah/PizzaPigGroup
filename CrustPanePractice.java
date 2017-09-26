import javafx.geometry.Insets;
import javafx.scene.control.Button;
// import JavaFX package with its subpackages and classes & ArrayList class from util package
//cheyenne was here 

/******************************************************************************************************

 NAME: Tori McCullah

 DATE: 09/11/2017

 ******************************************************************************************************/


public class CrustPanePractice extends Pane {

   // grid pane will organize buttons in an ordered fashion
   private GridPane grid = new GridPane();

   // array list will store all the crust types selected
   private String crust = "";

   // create buttons for all the topping choices
   private Button thin = new Button("thin");
   private Button original = new Button("original");
   private Button stuffed = new Button("stuffed");

   // establish contructor
   public CrustPanePractice() {

      // format then add buttons to grid
      buttonStyle(thin);
      buttonStyle(original);
      buttonStyle(stuffed);
      grid.addRow(0, thin, original, stuffed);
      grid.setPadding(new Insets(30, 30, 30, 30));
      grid.setHgap(20);

      // on mouse clicks, button selected is appeneded to list
      thin.setOnAction( e -> {
         crust = "thin";
         deactivateButtons();
      });

      original.setOnAction( e -> {
         crust = "original";
         deactivateButtons();
      });

      stuffed.setOnAction( e -> {
         crust = "stuffed";
         deactivateButtons();
      });


      getChildren().add(grid);
   }


   public String getCrust() {
      return crust;
   }


   private void buttonStyle(Button button) {
      button.setStyle(
              "-fx-font: 22px Silom; -fx-base: #b6e7c9; -fx-min-width: 150px; -fx-min-height: 100px;"
                      + " -fx-background-radius: 15em; -fx-max-width: 150px; -fx-max-height: 100px;"
      );
   }

   // method to activate buttons
   public void activateButtons() {
      thin.setDisable(false);
      original.setDisable(false);
      stuffed.setDisable(false);
   }

   // method to deactivate buttons
   public void deactivateButtons() {
      thin.setDisable(true);
      original.setDisable(true);
      stuffed.setDisable(true);
   }

}
