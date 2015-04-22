/** This class creates/displays all notifications.
*/
public class NotificationHandler {
   String message = "";
   public void create(String outMsg, UserAccount acct, Item item) {
      if (outMsg.equals("renew")) {
         message = "Notification of Renewal for " + 
                   acct.getPassword() + " on item " + 
                   item.toString() + ".\n";
      }
      else if (outMsg.equals("reserve")) {
         message = "New Reservation made by " + 
                   acct.getPassword() + "for item " + 
                   item.toString() + ".\n"; 
      }
      //how to send message to an Associate?
   }
}