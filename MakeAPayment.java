package PizzaPOS;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;import javafx.scene.Node;
import  javafx.scene.control.Button;
import static javafx.application.Application.launch;

//**Sonya Rivers **//
//SWE 3313 Group Project **//
public class MakeAPayment extends  Pane{

    StackPane stackPane = new StackPane();
    private VBox vbox = new VBox();
    BorderPane borderPane = new BorderPane();;
    PaymentPane detailsPane = new PaymentPane();
    private  Button detailButtons[] = new Button[4];
    private VBox receiptBox = new VBox();

    PaymentPane paymentPane = new PaymentPane();

    public void Start(Stage stage)
    {
        //hbox.setPadding(new Insets(15,12,15,12));
     //   hbox.setSpacing(10);
        //hbox.setStyle("-fx-font: 22px Silom; -fx-base: #b6e7c9; -fx-pref-width: 150px; -fx-pref-height: 90px;");
        //********************************************************************
        //**Later needs to be changed to show the order ID number!
        Text paymentTitle = new Text("Make a Payment:");
        paymentTitle.setFont(Font.font("-fx-font: 22px Silom"));
        //********************************************************************



        borderPane.setCenter(paymentPane);
        borderPane.setAlignment(paymentPane, Pos.CENTER);
        borderPane.setPadding(new Insets(15, 15, 15, 15));
        borderPane.setStyle("-fx-background-color: #003333;");

        //**Create new receipt text field that will not be editable
        TextArea receipt = new TextArea("");
        receipt.setFont(Font.font("Lucida Grande", 12));
        receipt.setEditable(false);

        // create a label with text that is white, size 12, font is Lucida Grande
        Label receiptLbl = new Label("Receipt: \n\n\n");
        receiptLbl.setFont(Font.font("Lucida Grande", 12));
        receiptLbl.setStyle("-fx-text-fill: white");

        // add text area, receipt, and its label to vBox & change receipt's shape (long rectangle)

        receiptBox.setSpacing(10);
        receiptBox.setPadding(new Insets(0,0,20,20));
        receiptBox.getChildren().addAll(receiptLbl,receipt);
        receiptBox.setPrefWidth(300);
        receiptBox.setPrefHeight(400);
        receipt.setPrefRowCount(20);



        FlowPane flow = addFlowPane();
        borderPane.setRight(flow);


        //Set the detail payment buttons in the bottom right corner under the receipt box
      //  borderPane.setBottom(paymentPane.detailButtonsTop);

        //borderPane.setAlignment(paymentPane.detailButtonsBottom, Pos.BOTTOM_RIGHT);

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

        flow.getChildren().add(receiptBox);

        detailButtons[0] = paymentPane.discount;
        detailButtons[1] = paymentPane.tip;
        detailButtons[2] = paymentPane.print;
        detailButtons[3] = paymentPane.done;


        for (int i=0; i<4; i++) {
            flow.getChildren().add(detailButtons[i]);
        }

        return flow;
    }

    public static void main(String[] args) {
        Application.launch();
    } // launch application of pizza practice

}





