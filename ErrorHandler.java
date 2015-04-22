/** This class deals with creating/displaying errors.
*/
import java.util.Scanner;

public class ErrorHandler {
   
   public static void create(String error) {
      String message;
      Scanner userIn = new Scanner(System.in);
      String ok = null;
      switch (error) {
         case "noMatch": 
            message = "Error: Requested item was not found.\n";
            break;
         case "notFound": 
            message = "Error: Requested account was not found.\n";
            break;
         case "highFee":
            message = "Error: Account fee total exceeds $5.00.\n";
            break;
         case "maxCheck":
            message = "Error: Account has reached the maximum " +
                      "number of checkout items allowed.\n";
            break;
         case "maxRating":
            message = "Error: Item rating exceeds maturity level " +
                      "of account.\n";
            break;
         case "loggedIn": 
            message = "Error: Account currently logged in.\n";
            break;
         case "nonNum": 
            message = "Error: A non-numerical character was entered.\n";
            break;
         case "prevHold": 
            message = "Error: Cannot complete request: reservation waiting.\n";
            break;
         case "prevRenew":
            message = "Error: Item can only be renewed once.\n";
            break;
         case "noneAvail": 
            message = "Error: No copies of this item currently available.\n";
            break;
         case "lost": 
            message = "Error: Item status is Lost, manually reset.\n";
            break;
         default: 
            message = "Error: An unknown error occurred.\n";
            break;
      }
      System.out.print(message);
      while (ok == null) {
         System.out.print("Please type 'okay' to continue: \n");
         ok = userIn.nextLine();
         System.out.print("\n");
         ok.toLowerCase();
         if (!ok.equals("okay")) {
            ok = null;
         }
      }
   }
}