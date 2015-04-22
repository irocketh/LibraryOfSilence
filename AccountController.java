/** This class coordinates Account-related actions.
*/
public class AccountController { 
   Inventory inventory; 
   Date date;
   ArrayList<UserAccount> users;
   UserLogInMenu uLogIn;
   AdminLogInMenu aLogIn;
   
   public void create(Inventory inv, ArrayList<UserAccount> userList) {
      inventory = inv;
      users = userList;
      uLogIn = new UserLogInMenu();
      uLogIn.display();
   }
   
   public int verify(String userID) {
      for (int i = 0; i < 9; i++) {
         if (userID.charAt(i) 
      }
   }
   
   public int verify(String userID, int password) {
      
   }
   
   public void notify() {
      aLogIn = new AdminLogInMenu();
      aLogIn.display();
   }
}