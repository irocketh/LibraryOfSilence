/**
Margaret Caufield - mec0030
4/14/15
*/

public class VideoGameDescription extends ItemDescription
{
   private GameRating rating;
   
   public VideoGameDescription(String titleIn, int yearIn, int lengthIn, 
      GameRating ratingIn)
   {
      super(titleIn, yearIn, lengthIn);
      rating = ratingIn;
   }
   
   public GameRating getRating()
   {
      return rating;
   }
   
   public void setRating(GameRating ratingIn)
   {
      rating = ratingIn;
   }
   
   public String toString()
   {
   StringBuilder toRet = new StringBuilder();
   toRet.append(super.toString());
   toRet.append("\nType\t\tVideo Game");
   toRet.append("\nRating\t\t" + rating);
   
   return toRet.toString();
   }

}