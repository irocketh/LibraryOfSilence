/**
Margaret Caufield - mec0030
4/14/15
*/

public class BookDescription extends ItemDescription
{
   private String author;
   private String ISBN;
   
   public BookDescription(String titleIn, int yearIn, int lengthIn, 
      String authorIn, String ISBNIn)
   {
      super(titleIn, yearIn, lengthIn);
      author = authorIn;
      ISBN = ISBNIn;
   }

   public String getAuthor()
   {
      return author;
   }
   
   public void setAuthor(String authorIn)
   {
      author = authorIn;
   }
   
   public String getISBN()
   {
      return ISBN;
   }
   
   public void setISBN(String ISBNIn)
   {
      ISBN = ISBNIn;
   }
   public String toString()
   {
   StringBuilder toRet = new StringBuilder();
   toRet.append(super.toString());
   toRet.append("\nType\t\tBook");
   toRet.append("\nAuthor\t\t" + author);
   toRet.append("\nISBN\t\tISBN");
   
   return toRet.toString();
   }

}