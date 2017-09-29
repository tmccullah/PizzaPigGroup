package PizzaPOS;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Node;
import  javafx.scene.control.Button;
import static javafx.application.Application.launch;

//**Sonya Rivers **//
//SWE 3313 Group Project **//


public class PaymentPane extends  Pane {


    private GridPane grid = new GridPane();


    //**Methods of payment buttons
    private Button cash = new Button();
    private Button check = new Button();
    private Button visa = new Button();
    private Button mastercard = new Button ();
    private Button americanExpress = new Button();
    private Button discover = new Button();
    private Button gift = new Button();

    //**Payment detail buttons
    private Button discount = new Button();
    private Button tip = new Button ();
    private Button print = new Button();
    private Button done = new Button();


    public PaymentPane() {

        // format buttons
        cash.setId("cash");
        buttonStyle(cash);

        check.setId("check");
        buttonStyle(check);

        visa.setId("visa");
        buttonStyle(visa);

        mastercard.setId("mastercard");
        buttonStyle(mastercard);

        americanExpress.setId("americanexpress");
        buttonStyle(americanExpress);

        discover.setId("discover");
        buttonStyle(discover);

        gift.setId("gift");
        buttonStyle(gift);

        discount.setStyle("-fx-font: 22px Silom; -fx-base: #DD55CC; -fx-pref-width: 150px; -fx-pref-height: 90px;");
        tip.setStyle("-fx-font: 22px Silom; -fx-base: #DD55CC; -fx-pref-width: 150px; -fx-pref-height: 90px;");
        print.setStyle("-fx-font: 22px Silom; -fx-base: #DD55CC; -fx-pref-width: 150px; -fx-pref-height: 90px;");
        done.setStyle("-fx-font: 22px Silom; -fx-base: #DD55CC; -fx-pref-width: 150px; -fx-pref-height: 90px;");


        // add buttons to grid
        grid.addRow(0, cash, check, visa, mastercard);
        grid.addRow(1,americanExpress, discover,gift);
        grid.setPadding(new Insets(30, 30, 30, 30));
        grid.setHgap(20);
        grid.setVgap(20);

        getChildren().add(grid);
    }

    //** activate all buttons
    public void activateButtons() {
        cash.setDisable(false);
        check.setDisable(false);
        visa.setDisable(false);
        mastercard.setDisable(false);
        americanExpress.setDisable(false);
        discover.setDisable(false);
        gift.setDisable(false);
        discount.setDisable(false);
        tip.setDisable(false);
        print.setDisable(false);
        done.setDisable(false);
    }

    //**deactivate buttons (?)



    private void buttonStyle(Button button) {
        button.setStyle(
                "-fx-font: 22px Silom; -fx-base: #b6e7c9; -fx-pref-width: 150px; -fx-pref-height: 90px;"

        );

        buttonImg(button);
    }

    private void buttonImg(Button button)
    {

       String filePath = button.getId();

        switch(filePath)
         {
         case "cash": filePath = "cash.png";
           break;

          case "check": filePath = "check.png";
          break;

         case "visa": filePath = "visa.png";
           break;

             case "mastercard": filePath = "mastercard.png";
            break;

               case "americanexpress": filePath = "americanexpress.png";
                  break;
//
           case "discover": filePath = "discover.png";
                 break;

          case "gift": filePath = "gift.png";
             break;
         default:
            break;
         }

      // System.out.println( "Path: " + getClass().getResource("/").toExternalForm());
     Image img = new Image(getClass().getResourceAsStream(filePath));
        button.setGraphic(new ImageView(img));
    }


}
