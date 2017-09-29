package PizzaPOS;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
    private HBox hbox = new HBox();
  //  private VBox vbox = new VBox();
    BorderPane borderPane = new BorderPane();;
    PaymentPane detailsPane = new PaymentPane();

    PaymentPane paymentPane = new PaymentPane();

    public void Start(Stage stage)
    {
        hbox.setPadding(new Insets(15,12,15,12));
        hbox.setSpacing(10);
        hbox.setStyle("-fx-font: 22px Silom; -fx-base: #b6e7c9; -fx-pref-width: 150px; -fx-pref-height: 90px;");
        //********************************************************************
        //**Later needs to be changed to show the order ID number!
        Text paymentTitle = new Text("Make a Payment:");
        paymentTitle.setFont(Font.font("-fx-font: 22px Silom"));
        //********************************************************************



        borderPane.setCenter(paymentPane);
        borderPane.setAlignment(paymentPane, Pos.CENTER);
        borderPane.setPadding(new Insets(15, 15, 15, 15));
        borderPane.setStyle("-fx-background-color: #003333;");

        Scene scene = new Scene(borderPane, 1100, 700); // add border pane to scene
        stage.setScene(scene); // set scene on the stage
        stage.setTitle("Pizza Payment"); // set title for stage
        stage.show(); // display stage
    }
    public static void main(String[] args) {
        Application.launch();
    } // launch application of pizza practice

}



