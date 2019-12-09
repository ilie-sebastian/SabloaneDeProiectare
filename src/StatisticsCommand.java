
public class StatisticsCommand implements Command
{

	@Override
	public void execute() {
		try {
		// TODO Auto-generated method stub
		BookStatistic stats = new BookStatistic();
		DocumentManager doc = DocumentManager.getInstance();
		Carte c = doc.getBook();
		Element e = c.getContent(0);
		e.accept(stats);
		stats.printStatistics();
		} catch (NullPointerException e) {}
		
	}

	@Override
	public void unexecute() {
		// TODO Auto-generated method stub
		
	}

}
