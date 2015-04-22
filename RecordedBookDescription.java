/**
Margaret Caufield - mec0030
4/14/15
*/

public class RecordedBookDescription extends BookDescription
{
   private String narrator;
   
   public RecordedBookDescription(String titleIn, int yearIn, int lengthIn, 
      String authorIn, String ISBNIn, String narratorIn)
   {
      super(titleIn, yearIn, lengthIn, authorIn, ISBNIn);
      narrator = narratorIn;
   }
      
   public String getNarrator()
   {
      return narrator;
   }
   
   public void setNarrator(String narratorIn)
   {
      narrator = narratorIn;
   }
   
      public String toString()
   {
   StringBuilder toRet = new StringBuilder();
   toRet.append(super.toString());
   toRet.append("\nForm\t\tAudio Book");
   toRet.append("\nNarrator\t\t" + narrator);
   
   return toRet.toString();
   }


}