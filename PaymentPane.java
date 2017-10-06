package PizzaPOS;

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

import javax.swing.*;

import static javafx.application.Application.launch;

//**Sonya Rivers **//
//SWE 3313 Group Project **//


public class PaymentPane extends  Pane {

    //**Grid and BorderPane setup
    private GridPane grid = new GridPane();
    private BorderPane borderPane = new BorderPane();


    //**Payment method buttons
    private Button cash = new Button("Cash");
    private Button check = new Button("Check");
    private Button visa = new Button("Visa");
    private Button mastercard = new Button ("Mastercard");
    private Button americanExpress = new Button("American Express");
    private Button discover = new Button("Discover");
    private Button gift = new Button("Gift Card");
    private Button coupon = new Button("Coupon");

    //**Payment detail buttons
    public Button discount = new Button("Discount");
    public Button tip = new Button ("Tip");
    public Button print = new Button("Print");
    public Button done = new Button("Done");



    //**Creates the payment buttons for the payment pane
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

        coupon.setId("coupon");
        buttonStyle(coupon);

        discount.setId("discount");
        buttonStyle(discount);

        tip.setId(("tip"));
        buttonStyle(tip);

        print.setId("print");
        buttonStyle(print);

        done.setId("done");
        buttonStyle(done);




        // add payment buttons to top left corner of grid
        grid.addRow(0, cash, check, visa, mastercard);
        grid.addRow(1,americanExpress, discover,gift, coupon);
        grid.setPadding(new Insets(30, 30, 30, 30));
        grid.setHgap(20);
        grid.setVgap(20);

        getChildren().addAll(grid);


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
        coupon.setDisable(false);
        discount.setDisable(false);
        tip.setDisable(false);
        print.setDisable(false);
        done.setDisable(false);
    }

    //**deactivate buttons (?)


    //**Sets the button style for font/image/size/color
    private void buttonStyle(Button button) {
        button.setStyle(
              "-fx-font: 12px Arial; -fx-base: #b6e7c9; -fx-pref-width: 150px; -fx-pref-height: 90; -fx-text-alignment: bottom_center"


        );

        button.setContentDisplay(ContentDisplay.TOP);
        //Assign an image to the button
        buttonImg(button);

        //Add a dropshadow when the button is highlighted
        DropShadow shadow = new DropShadow();
        button.addEventHandler(MouseEvent.MOUSE_ENTERED,
        new EventHandler<MouseEvent>(){
            @Override public void handle(MouseEvent e){
                button.setEffect(shadow);
            }
        });

        //Turn off dropshadow when button isn't highlighted
        button.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent e) {
                        button.setEffect(null);
                    }
                });

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

             case "coupon": filePath = "coupon.png";
             break;

             case "discount": filePath = "discount.png";
                 break;

             case "tip": filePath = "tip.png";
                 break;

             case "print": filePath = "print.png";
                 break;

             case "done": filePath = "done.png";
                 break;


         default:
            break;
         }

      // System.out.println( "Path: " + getClass().getResource("/").toExternalForm());
     Image img = new Image(getClass().getResourceAsStream(filePath));
        button.setGraphic(new ImageView(img));
        button.setGraphicTextGap(1.0);
    }



}
