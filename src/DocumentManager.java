
public class DocumentManager {
	private static DocumentManager doc;
	private Carte book;
	private DocumentManager() {
		
	}
	public static DocumentManager getInstance()
	{
		if(doc == null) {
		doc = new DocumentManager();
		}
		return doc;
	}
	public Carte getBook() {
		return book;
	}
	public void setBook(Carte book) {
		this.book = book;
	}
	
	
}
