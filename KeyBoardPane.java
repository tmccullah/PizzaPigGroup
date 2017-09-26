import javafx.geometry.Insets;
import javafx.scene.control.Button;
// import JavaFX package with its subpackages and classes & ArrayList class from util package


/******************************************************************************************************

NAME: Tori McCullah

DATE: 09/11/2017

******************************************************************************************************/


public class KeyBoardPane extends Pane {

   // grid pane will organize buttons in an ordered fashion
   private GridPane grid = new GridPane();
   
// create buttons for all the keys on the keyboard
   private Button a = new Button("a"); 
   private Button b = new Button("b"); 
   private Button c = new Button("c"); 
   private Button d = new Button("d"); 
   private Button e = new Button("e"); 
   private Button f = new Button("f");
   private Button g = new Button("g"); 
   private Button h = new Button("h"); 
   private Button i = new Button("i"); 
   private Button j = new Button("j"); 
   private Button k = new Button("k"); 
   private Button l = new Button("l");
   private Button m = new Button("m"); 
   private Button n = new Button("n"); 
   private Button o = new Button("o"); 
   private Button p = new Button("p"); 
   private Button q = new Button("q"); 
   private Button r = new Button("r");
   private Button s = new Button("s"); 
   private Button t = new Button("t"); 
   private Button u = new Button("u"); 
   private Button v = new Button("v"); 
   private Button w = new Button("w"); 
   private Button x = new Button("x");
   private Button y = new Button("y"); 
   private Button z = new Button("z");
    
   private Button A = new Button("A"); 
   private Button B = new Button("B"); 
   private Button C = new Button("C"); 
   private Button D = new Button("D");
   private Button E = new Button("E"); 
   private Button F = new Button("F"); 
   private Button G = new Button("G"); 
   private Button H = new Button("H"); 
   private Button I = new Button("I"); 
   private Button J = new Button("J");
   private Button K = new Button("K"); 
   private Button L = new Button("L"); 
   private Button M = new Button("M"); 
   private Button N = new Button("N"); 
   private Button O = new Button("O"); 
   private Button P = new Button("P");
   private Button Q = new Button("Q"); 
   private Button R = new Button("R"); 
   private Button S = new Button("S"); 
   private Button T = new Button("T"); 
   private Button U = new Button("U"); 
   private Button V = new Button("V");
   private Button W = new Button("W"); 
   private Button X = new Button("X"); 
   private Button Y = new Button("Y"); 
   private Button Z = new Button("Z");
   
   private Button num1 = new Button("1"); 
   private Button num2 = new Button("2");
   private Button num3 = new Button("3"); 
   private Button num4 = new Button("4"); 
   private Button num5 = new Button("5"); 
   private Button num6 = new Button("6"); 
   private Button num7 = new Button("7"); 
   private Button num8 = new Button("8");
   private Button num9 = new Button("9"); 
   private Button num0 = new Button("0");
   
   private Button space = new Button("space");
   private Button period = new Button(".");
   private Button slash = new Button("/");
   private Button dash = new Button("-");
   private Button dollarSign = new Button("$");
   private Button pound = new Button("#");
   private Button exclamationMark = new Button("!");
   private Button questionMark = new Button("?");
   private Button backspace = new Button("delete");
   private Button clear = new Button("clear");
   private Button done = new Button("DONE");
   
   private String keyEntry = "";
   
   
// establish contructor   
   public KeyBoardPane() {
      
   // add buttons to grid
   
      grid.addRow(0, 
         num1, num2, num3, num4, num5, num6, num7, num8, num9, num0);
      
      grid.addRow(1, 
         q, w, e, r, t, y, u, i, o, p, backspace);
      
      grid.addRow(2, 
         pound, a, s, d, f, g, h, j, k, l, clear);
      
      grid.addRow(3, 
         dollarSign, period, z, x, c, v, b, n, m, exclamationMark, questionMark);
      
      grid.addRow(4, 
         dash, slash, space, done);
      
      
      grid.setPadding(new Insets(10, 10, 10, 10));
      grid.setHgap(5);
      grid.setVgap(5);
      
      getChildren().add(grid);
   }

   
   private void buttonStyle(Button button) {
      button.setStyle(
         "-fx-font: Verdana 18; -fx-base: #CCFFFF; -fx-pref-width: 50px; "
         + "-fx-pref-height: 50px"
      );
   }
 
/* ADD TO MAIN ONE   
   public void keySelected(Button b) {
      b.setOnAction( e -> { receipt.append(getKeyEntry(b)); });
   }
*/
   
   public String getKeyEntry (Button b) {
   // assign a string to button's label, which will represent a keyboard character
      String s = b.getText();
         
      if (s.equals("space")) {
         s = " "; // add a space
         keyEntry += s;
      }
         
      else if (s.equals("delete") || s.equals("clear")) {
         if (keyEntry.length() > 0) {
         
         // delete acts as the backspace
            if (s.equals("delete"))
               keyEntry = keyEntry.substring(0, keyEntry.length()-1);
         
         // otherwise clear entire entry
            else
               keyEntry = "";
         }
      }
      
   // basically do nothing, keep the keyEntry as it is
      else if (s.equals("done")) {
         s = "";
         keyEntry += s;
      }
      
   // otherwise append the character to the keyEntry string
      else
         keyEntry += s;
      
      
      return keyEntry;
   }
   
   
   
   /* text.setOnKeyPressed( e -> {
         switch(e.getCode()) {
            case DOWN: text.setY(text.getY() + 10); break
            default:
         }
      }
   */
}