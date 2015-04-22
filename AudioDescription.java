/**
Margaret Caufield - mec0030
4/14/15
*/

public class AudioDescription extends ItemDescription
{

   private String artist;
   
   public AudioDescription(String titleIn, int yearIn, int lengthIn, String artistIn)
   {
      super(titleIn, yearIn, lengthIn);
      artist = artistIn;
   }

   public String getArtist()
   {
      return artist;
   }
   
   public void setArtist(String artistIn)
   {
      artist = artistIn;
   }
   
      
   public String toString()
   {
   StringBuilder toRet = new StringBuilder();
   toRet.append(super.toString());
   toRet.append("\nType\t\tAudio");
   toRet.append("\nArtist\t\t" + artist);
   
   return toRet.toString();
   }

}