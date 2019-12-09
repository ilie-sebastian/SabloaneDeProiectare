import java.util.Stack;

public class DocumentManager {
	private static DocumentManager doc;
	private Carte book;
	private Sectiune sectiune;
	private Observer firstObserver = new FirstObserver();
	private Observer secondObserver = new SecondObserver();
	private Stack<Command> history = new Stack<Command>();
	public Command getHistory() {
		Command c = this.history.peek();
		this.history.pop();
		return c;
	}
	public void setHistory(Command history) {
		this.history.push(history);
	}
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
	public void setSectiune(Sectiune sectiune)
	{
		this.sectiune = sectiune;
	}
	public Sectiune getSectiune()
	{
		return this.sectiune;
	}
	public Observer getFirstOberver()
	{
		return this.firstObserver;
	}
	public Observer getSecondOberver()
	{
		return this.secondObserver;
	}
	
			
			
	
	
}
