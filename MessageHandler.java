/** This class deals with creating/displaying messages.
*/
import java.util.Scanner;
import java.text.NumberFormat;

public class MessageHandler {
   public void display(double amt, double owe) {
      String message;
      NumberFormat doll = NumberFormat.getCurrencyInstance();
      Scanner userIn = new Scanner(System.in);
      String ok = null; 
      
      if (amt > owe) {
         message = "Payment exceeds amount owed; please try " + 
                   "again with an amount equal or less than " + 
                   doll.format(owe) + ".\n";
      }
      else if (amt == owe) {
         message = "Success! Payment accepted. Fee balance: " + 
                   "$0.00. Thank you.\n";
      }
      else {
         double newBal = (owe - amt);
         message = "Payment accepted. New fee balance is " +
                   doll.format(newBal) + ".\n";
      }
      System.out.print(message);
      while (ok == null) {
         System.out.print("Please type 'okay' to continue: ");
         ok = userIn.nextLine();
         ok.toLowerCase();
         if (!ok.equals("okay")) {
            ok = null;
         }
      }
   }
}