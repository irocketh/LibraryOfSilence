/** This is created whenever a Customer bring books to
    the Associate to be checked in/out.
**/


public class TransactionRpt{
   int available, checked, idNum, curr;
   String rptType;
   UserAccount cust;
   Item[] transList;
   int[] transDates;

   public void create(UserAccount acct) {
      curr = 0;
      cust = acct; 
      checked = cust.getCheckOutList().length;
      available = cust.getMaxChecked() - checked; 
      transList = new Item[available]; 
      transDates = new int[available];
   }
   
   public int setType(String type) {
      type = type.toLowerCase();
      if (!type.equals("check in") || !type.equals("check out")) {
         return 1;
      }
      rptType = type;
      return 0;
   }
   
   public String getType() {
      return rptType;
   }
   
   public int addItem(Item item) {
      if (curr > available) {
         return 1; 
      }
      if (item.getRating() > cust.getMaxRating()) {
         return 2;
      }
      transList[curr] = item;
      transDates[curr] = item.getCheckOutPeriod;
      curr++;
      return 0; 
   }
   
   public Item[] getTransList() {
      return transList;
   }
   
   public int[] getTransDates() {
      return transDates;
   }
}