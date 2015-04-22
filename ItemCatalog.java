/**
Margaret Caufield - mec0030
4/16/15
*/
import java.util.ArrayList;


public class ItemCatalog
{
   private ArrayList<InventoryItem> catalog = new ArrayList<InventoryItem>();
   
   public boolean addItem(InventoryItem itemIn)
   {
      if (!uniqueId(itemIn))
      {
         return false;
      }
      
      catalog.add(itemIn);
      return true;
   }
   
   private boolean uniqueId(InventoryItem itemIn)
   {
      for(InventoryItem item : catalog)
      {
         if(itemIn.getId() == item.getId())
         {
            return false;
         }
      }
      return true;
   }
   
   public boolean deleteItem(InventoryItem i)
   {
      return catalog.remove(i);
   }
   
   public ArrayList<InventoryItem> search(String search)
   {
      ArrayList<InventoryItem> toRet = new ArrayList<InventoryItem>();
      //for times' sake we only search for title
      for(InventoryItem item : catalog)
      {
         if(item.getDescription().getTitle().equals(search))
         {
            toRet.add(item);
         }
      }
      return toRet;
   }
   
}