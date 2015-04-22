/**
Margaret Caufield - mec0030
4/14/15
*/

public class DVDDescription extends MovieDescription
{
   public DVDDescription(String titleIn, int yearIn, int lengthIn, 
      String ratingIn, String directorIn)
   {
      super(titleIn, yearIn, lengthIn, ratingIn, directorIn);
   }

   public String toString()
   {
   StringBuilder toRet = new StringBuilder();
   toRet.append(super.toString());
   toRet.append("\nForm\t\tDVD");
   
   return toRet.toString();
   }
}