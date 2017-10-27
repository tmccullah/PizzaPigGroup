package PizzaPOS;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;import javafx.scene.Node;
import  javafx.scene.control.Button;
import javafx.util.Pair;

import static javafx.application.Application.launch;

//**Sonya Rivers **//
//SWE 3313 Group Project **//

//**This class takes in several fields from the user for the credit card info in order to process payment
public class AuthorizePayment extends Pane {

//**Need to GET these text strings from DB entries for receipt in previous pane
private String orderNum;
private String totalAmount;
private String totalReceived;
private String balance;
private TextField[] inputFields;

StackPane stackPane = new StackPane();
public Stage stage;
private GridPane grid = new GridPane();
private BorderPane borderPane = new BorderPane();
private TextField creditCardNum = new TextField();
private TextField cardType = new TextField();
private TextField expiration = new TextField();
private TextField customerName = new TextField();
private TextField CVVCode = new TextField();
private TextField address = new TextField();
private TextField zipCode = new TextField();
private TextField transactionNum = new TextField();
private Button cancelBtn = new Button("Cancel");
private Button keyboardBtn = new Button("Keyboard");
private Button clearAllBtn = new Button("Clear All");
private Button processBtn = new Button("Process");
private HBox inputBox;



public void Start(Stage stage) {

        //borderPane.setCenter(paymentPane);
      //  borderPane.setAlignment(paymentPane, Pos.CENTER);
        borderPane.setPadding(new Insets(15, 15, 15, 15));
        borderPane.setStyle("-fx-background-color: #003333;");


//**Set up FlowPane to hold all input sections

FlowPane flow = addFlowPane();
borderPane.setLeft(flow);

//********************************************************************
//**Later needs to be changed to show the order ID number!
Label paymentTitle = new Label("Please Swipe or Enter Credit Card");
paymentTitle.setFont(Font.font("Lucida Grande", 18));
paymentTitle.setStyle("-fx-text-fill: white;");
paymentTitle.setTextAlignment(TextAlignment.CENTER);
borderPane.setTop(paymentTitle);
//********************************************************************


//**Credit card number (15 digits) Text field; Required

int cardNumLength = creditCardNum.toString().length();
if(cardNumLength > 15 || cardNumLength < 15)
{
        ErrorDialog("Invalid Credit Card Number", "Please enter a valid card number");
}

//**Type of card based on the button pressed on prev screen (visa,mastercard,etc); Required
//**This is a read-only text field; need to GET text from DB

//**Expiration date(00/00/0000) Text field; Required

//**Cardholder's name; Text field; Optional

//**Card CVV code (3 digits) Text field; Required

//**Card holder address (string) Text field; Optional

//**Card holder zipcode (5 digits) Text field; Optional

//**Transaction number
//**This is a read-only text field; need to GET text from DB

//**Cancel button

//**Keyboard button

//**Clear All fields button

//** Process button

//**Total price and Pre-Auth Amount (can set this based on how much of the balance you want to pay in portions, ex 1/2 1/3 1)

//**Numeric keys to type in numbers in all fields

        grid.addRow(0,creditCardNum);
        grid.addRow(1,cardType);
        grid.addRow(2,cardType);
        grid.addRow(3,expiration);
        grid.addRow(4,customerName);
        grid.addRow(5,CVVCode);
        grid.addRow(6,address);
        grid.addRow(7,zipCode);
        grid.addRow(8,transactionNum);
        grid.setPadding(new Insets(30, 30, 30, 30));
        grid.setHgap(20);
        grid.setVgap(20);

        getChildren().addAll(grid);

        //**Set up scene
        Scene scene = new Scene(borderPane, 1100, 700); // add border pane to scene
        //receiptBox.getStyleClass().add("vbox");
        stage.setScene(scene); // set scene on the stage
        stage.setTitle("Make a Payment"); // set title for stage
        stage.show(); // display stage
}

//**Adds a FlowPane to display the receipt VBox and the payment detail buttons
public FlowPane addFlowPane() {

        FlowPane flow = new FlowPane();
        flow.setPadding(new Insets(5, 0, 5, 10));
        flow.setVgap(5);
        flow.setHgap(5);
        flow.setPrefWrapLength(372); // preferred width allows for two columns

        flow.getChildren().add(inputBox);

        inputFields[0] = creditCardNum;
        inputFields[1] = cardType;
        inputFields[2] = expiration;
        inputFields[3] = customerName;
        inputFields[4] = CVVCode;
        inputFields[5] = address;
        inputFields[6] = zipCode;
        inputFields[7] = transactionNum;


        for (int i=0; i<8; i++) {
                flow.getChildren().add(inputFields[i]);
        }

        return flow;
}

public void AlertMsg(String title, String message)
{
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
}

public void ErrorDialog(String title, String message)
{
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);

        alert.showAndWait();
}

public static void main(String[] args) {Application.launch();}

}

