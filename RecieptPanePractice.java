package pizza_pos;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RecieptPanePractice extends Pane {
	
	   // grid pane will organize buttons in an ordered fashion
	   private FlowPane pane = new FlowPane();
	   
	   // array list will store all the crust types selected
	   private String r = "";
	   
	   // create buttons for all the topping choices
	   private Button print = new Button("Print"); 	   
	   private Button addButton = new Button("Add"); 
	   private Button deleteButton = new Button("Remove"); 
	   private TextArea receipt = new TextArea("");
	   
	   // establish contructor   
	   public RecieptPanePractice() {
		  
		      //receipt.setPrefRowCount(10);
		      receipt.setFont(Font.font("Lucida Grande", 12));
		      receipt.setEditable(false);
		      receipt.setText("\t\t\t\t Pizza Pig \n Order Number:  \n Customer: \n Employee: "
		      		+ "\n Time: ");
		   
	      deleteButton.setOnAction( e -> { 
	         // some action
	    	 receipt.replaceSelection("");  //remove/replace text
	    	  
	      }); 
	      
	      addButton.setOnAction( e -> { 
		         // some action
		    	 EnterText(); 
		      }); 
	      
	      
	      
	           
	      pane.getChildren().addAll(receipt, print, addButton, deleteButton);
	      getChildren().add(pane);
	   }


	   public void enterText(String s1) {
		   //Scanner scan = new Scanner(System.in);
		   //String s = scan.nextLine();
		   receipt.appendText(s1);
	   }
	   
	   public void EnterText() {
		   Scanner scan = new Scanner(System.in);
		   System.out.print("Enter number of items or Special directions:");
		   String s = scan.nextLine();
		   receipt.appendText(s);
	   }
	   
	   public void removeText(String s, TextArea txtArea) {
		   txtArea.replaceSelection(s);
	   }
	   
	   private void buttonStyle(Button button) {
	      button.setStyle(
	         "-fx-font: 22px Silom; -fx-base: #b6e7c9; -fx-min-width: 150px; -fx-min-height: 100px;" 
	         + " -fx-background-radius: 15em; -fx-max-width: 150px; -fx-max-height: 100px;"
	      );
	   }

}
