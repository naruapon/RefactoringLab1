
public class Book {

	private String bookID;
	private String bookType;
	private String bookISBN;
	private String bookTitle;
	private float bookPrice;
	
	Book(){
		bookID = "";
		bookType = "";
		bookISBN = "";
		bookTitle = "";
		bookPrice = (float) 0.0;
	}
	
	public void setBook(String pbookID, String pbookType, String pbookISBN, String pbookTitle, float pbookPrice) {
		bookID = pbookID;
		bookType = pbookType;
		bookISBN = pbookISBN;
		bookTitle = pbookTitle;
		bookPrice = (float) pbookPrice;	
	}
	
	public String getDetailbook() {
		return "Book ID   : "+bookID+"\n"+
			   "Book Name : "+bookType+"\n"+
			   "Book ISBN : "+bookISBN+"\n"+
			   "Book Title: "+bookTitle+"\n"+
			   "Book Price: "+bookPrice+"\n";
	}
}
