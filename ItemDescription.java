/**
Margaret Caufield - mec0030
4/14/15
*/

public abstract class ItemDescription
{
   private int yearReleased;
   private String title;
   private int lengthOfRental;
   private double finePerDay;
   
   public ItemDescription(String titleIn, int yearIn, int lengthIn, double fineIn)
   {
      title = titleIn;
      yearReleased = yearIn;
      lengthOfRental = lengthIn;
      finePerDay = fineIn;
   }
   
   public int getYearReleased()
   {
      return yearReleased;
   }
   
   public void setArtist(int yearIn)
   {
      yearReleased = yearIn;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public void setTitle(String titleIn)
   {
      title = titleIn;
   }
   
   public int getRentalLength()
   {
      return lengthOfRental;
   }
   
   public void setRentalLength(int lengthIn)
   {
      lengthOfRental = lengthIn;
   }
   
   public void setFine(double fineIn)
   {
      finePerDay = fineIn;
   } 
   
   public double getFine(double fineIn)
   {
      return finePerDay;
   }
   
      public String toString()
   {
   StringBuilder toRet = new StringBuilder();
   toRet.append("\nTitle\t\t" + title);
   toRet.append("\nYear Released\t" + yearReleased);
   toRet.append("\nRental Length\t" + lengthOfRental);
   
   return toRet.toString();
   }
   
}