/** This class coordinates all transactions.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class TransactCtrller {
   UserAccount acct; 
   String type; 
   TransactionRpt tr;
   Inventory inventory;
   ArrayList<UserAccount> users;
   Date date;
   
   public int create(int idNum, Inventory inv, 
                     ArrayList<UserAccount> userList) {
      int i = 0;
      acct = null;
      users = userList;
      while ((acct == null) && (i < users.size())) {
         if (userList.get(i).identify(idNum)) {
            acct = userList.get(i);
         } 
      }
      inventory = inv;
      int error = 1;
      if (acct == null) {
         ErrorHandler.create("notFound");
         return 1;
      }
      if (acct.fee > 5.00) {
         ErrorHandler.create("highFee");
         return 1;
      }
      Scanner scan = new Scanner(System.in);
      tr = new TransactionRpt(acct);
      while (error == 1) {
         System.out.print("Please enter transaction type: ");
         type = scan.nextLine(); 
         System.out.print("\n");
         error = tr.setType(type);
         if (error == 1) {
            System.out.println("Not a valid type.");
         }
      }
      return 0;
   }
   
   public int scanItem(Item item) {
      int success;
      success = inventory.identify(item);
      if (success == 1) {
         ErrorHandler.create("noMatch");
         return 1;
      }
      if (tr.getType().equals("check in")) {
         inventory.changeStatus("available");
      }
      else if (tr.getType().equals("check out")) {
         inventory.changeStatus("checkedOut");
      }
      success = tr.addItem(item, date); 
      if (success == 1) {
         ErrorHandler.create("maxCheck");
         return 1;
      }
      else if (success == 2) {
         ErrorHandler.create("maxRating");
         return 1;
      }
      return 0; 
   }
   
   
   //add stuff about due dates
   public void finish() {
      int checked = acct.getCheckOutList().length;
      Item[] oldList = new Item[checked];
      Item[] transList = tr.getTransList();
      Date[] dueDates = tr.getDueDates();
      int curr = transList.length;
      int newVal, i, j;
      if (tr.getType() == "check out") {
         newVal = checked + curr;
         Item[] newList = new Item[newVal];
         for (i = 0; i < checked; i++) {
            newList[i] = oldList[i];
         }
         j = 0;
         for (i = checked; i < newVal; i++) {
            newList[i] = transList[j];
            j++;
         }
         acct.setcheckOutList(newList);
      }
      else if(tr.getType() == "check in") {
         newVal = checked - curr;
         int found;
         int k = 0;
         Item[] newList = new Item[newVal];
         for (i = 0; i < checked; i ++) {
            found = 0;
            for (j = 0; j < curr; j++) {
               if (oldList[i] == transList[j]) {
                  found = 1;
               }
            }
            if (found == 0) {
               newList[k] = oldList[i];
               k++;
            }
         }
      }
   }
}