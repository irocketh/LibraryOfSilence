/** This class is the specific user account.
*/

public class UserAccount {
   public enum ratings{PG, PG13, R};

   String name; 
   int password; 
   String address;
   Date birthday; 
   int age;
   int maxCheckOut;
   ratings rateLimit;
   double fee;
   Item[] checkOutList;
   Date[] dueDates;
   
   public UserAccount(String nme, int pswd, String addr, 
                      Date bday, int ageIn) {
      name = nme;
      password = password;
      address = addr;
      birthday = bday;
      maxCheckOut = 10;
      int age = ageIn;
      if (age < 13) {
         rateLimit = ratings.PG;
      }
      else if (age < 18) {
         rateLimit = ratings.PG13;
      }
      else {
         rateLimit = ratings.R;
      }
      fee = 0.00;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   public int getPassword() {
      return password;
   }
   
   public String getAddress() {
      return address;
   }
   
   public void setAddress(String addr) {
      address = addr;
   }
   
   public Date getBirthday() {
      return birthday;
   }
   
   public Item[] getCheckOutList() {
      return checkOutList;
   }
   
   public void setCheckOutList(Item[] newList) {
      checkOutList = newList;
   }
   
   public Date[] getDueDates() {
      return dueDates;
   }
   
   public void setDueDates(Date[] dates) {
      dueDates = dates;
   }
   
   public double getFee() {
      return fee;
   }
   
   public void setFee(double newFee) {
      fee = newFee;
   }
   
   public int getMaxChecked() {
      return maxCheckOut;
   }
   
   public void setMaxChecked(int newMax) {
      maxCheckOut = newMax;
   }
   
   public ratings getMaxRating() {
      return rateLimit;
   }
   
   public void setMaxRating(ratings rating) {
      rateLimit = rating;
   }
   
   public boolean identify(int idNum) {
      if(idNum == password) {
         return true;
      }  
      else {
         return false;
      }
   }
}