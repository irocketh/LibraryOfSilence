/**
Margaret Caufield - mec0030
4/14/15
*/

public class InventoryItem
{
   private int id;
   private ItemStatus status;
   private ItemDescription description;
   
   public InventoryItem(int idIn, ItemDescription desIn)
   {
      id = idIn;
      description = desIn;
      status = ItemStatus.CHECKED_IN;
   }
   
   public int getId()
   {
      return id;
   }
   
   public void setId(int idIn)
   {
      id = idIn;
   }
   
   public ItemStatus getItemStatus()
   {
      return status;
   }
   
   public void setItemStatus(ItemStatus statusIn)
   {
      status = statusIn;
   }
   
   public ItemDescription getDescription()
   {
      return description;
   }
   
   public void setDescription(ItemDescription desIn)
   {
      description = desIn;
   }
   
   public String toString()
   {
   StringBuilder toRet = new StringBuilder();
   toRet.append(description.toString());
   toRet.append("\nID\t\t" + id);
   toRet.append("\nStatus\t\t" + status.name());
   
   return toRet.toString();
   }

}