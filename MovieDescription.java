/**
Margaret Caufield - mec0030
4/14/15
*/

public class MovieDescription extends ItemDescription
{
   private String rating;
   private String director;
   
   public MovieDescription(String titleIn, int yearIn, int lengthIn, 
      String ratingIn, String directorIn)
   {
      super(titleIn, yearIn, lengthIn);
      rating = ratingIn;
      director = directorIn;
   }
   
   public String getRating()
   {
      return rating;
   }
   
   public void setRating(String ratingIn)
   {
      rating = ratingIn;
   }
   
   public String getDirector()
   {
      return director;
   }
   
   public void setDirector(String directorIn)
   {
      director = directorIn;
   }
   
   public String toString()
   {
   StringBuilder toRet = new StringBuilder();
   toRet.append(super.toString());
   toRet.append("\nType\t\tMovie");
   toRet.append("\nRating\t\t" + rating);
   toRet.append("\nDirector\t\t" + director);
   
   return toRet.toString();
   }

}