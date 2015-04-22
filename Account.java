/** This class is the interface for a standard Account.
*/
public abstract class Account {
   String name;
   String address;
   int password; 
   
   public Account(String initName, int pass) {
      name = initName;
      password = pass;
   }
   
   public String getName() {
      return name;
   }
   
   protected void setName(String nameIn) {
      name = nameIn;
   }
   
   public String getAddress() {
      return address;
   }
   
   public void setAddress(String addr) {
      address = addr;
   }
   
   public int getPassword() {
      return password;
   }  
}