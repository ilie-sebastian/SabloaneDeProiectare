
public class TestCarte {
	public static void main(String []args) throws Exception
	{
		
//		Sectiune cap1 = new Sectiune("Capitolul 1");
//		Paragraf p1 = new Paragraf("Paragraf 1");
//		cap1.add(p1);
//		Paragraf p2 = new Paragraf("Paragraf 2");
//		cap1.add(p2);
//		Paragraf p3 = new Paragraf("Paragraf 3");
//		cap1.add(p3);
//		Paragraf p4 = new Paragraf("Paragraf 4");
//		cap1.add(p4);
//		cap1.add(new ImagineProxy("ImageOne"));
//		cap1.add(new Imagine("ImageTwo"));
//		cap1.add(new Paragraf("Some text"));
//		cap1.add(new Tabel("Table 1"));
//		BookStatistic stats = new BookStatistic();
//		cap1.accept(stats);
//		//stats.printStatistics();
//		
//		BookCost cost = new BookCost();
//		cap1.accept(cost);
//		cost.printStatisticsCost();
//		System.out.println("JSON Builder");
//		String filename = "E:\\Informatica anul 3\\Design Patterns\\Laboratorul 1\\src\\book.json";
//		Builder jsonBuilder = new JSONBuilder(filename);
//		jsonBuilder.build();
//		Element myBook = jsonBuilder.getResult();
//		myBook.print();
		
//		System.out.println("XML Builder");
////		String filename2 = "E:\\Informatica anul 3\\Design Patterns\\Laboratorul 1\\src\\book2.xml";
//		String filename2 = "E:\\Informatica anul 3\\Design Patterns\\Laboratorul 1\\src\\book2.xml";
//		Builder xmlBuilder = new XMLBuilder(filename2);
//		xmlBuilder.build();
//		Element myBook2 = xmlBuilder.getResult();
//		myBook2.print();  
//		String filename = "E:\\Informatica anul 3\\Design Patterns\\Laboratorul 1\\src\\book.json";
//		Command cmd1 = new OpenCommand(filename);
//		cmd1.execute();
//		Command cmd2 = new StatisticsCommand();
//		cmd2.execute();
//		DocumentManager.getInstance().getBook().print();
		Sectiune cap1 = new Sectiune("Capitolul 1");
		Paragraf p1 = new Paragraf("Paragraf 1");
		cap1.add(p1);
		Paragraf p2 = new Paragraf("Paragraf 2");
		cap1.add(p2);
		Paragraf p3 = new Paragraf("Paragraf 3");
		cap1.add(p3);
		Paragraf p4 = new Paragraf("Paragraf 4");
		cap1.add(p4);
		cap1.add(new ImagineProxy("ImageOne"));
		cap1.add(new Imagine("ImageTwo"));
		cap1.add(new Paragraf("Some text"));
		cap1.add(new Tabel("Table 1"));
		
		cap1.setNewValue("CHAPTER 1");
		p1.setNewValue("PARAGRAPH 2");
		p2.setNewValue("PARAGRAPH 3");
		cap1.setNewValue("CHAPTER 1.1");
	}
}
