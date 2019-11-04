
public class TestCarte {
	public static void main(String []args)
	{
		
//		long startTime = System.currentTimeMillis();
//		ImagineProxy img1 = new ImagineProxy("Pamela Anderson");
//		ImagineProxy img2 = new ImagineProxy("Kim Kardashian");
//		ImagineProxy img3 = new ImagineProxy("Kirby Griffin");
//		Sectiune playboyS1 = new Sectiune("Front Cover");
//		playboyS1.add(img1);
//		Sectiune playboyS2 = new Sectiune("Summer Girls");
//		playboyS2.add(img2);
//		playboyS2.add(img3);
//		Carte playboy = new Carte("Playboy");
//		playboy.addContent(playboyS1);
//		playboy.addContent(playboyS2);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing of the section 1 took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing again the section 1 took " + (endTime -
//		startTime) + " milliseconds");
//		
//		long startTime = System.currentTimeMillis();
//		Imagine img1 = new Imagine("Pamela Anderson");
//		Imagine img2 = new Imagine("Kim Kardashian");
//		Imagine img3 = new Imagine("Kirby Griffin");
//		Sectiune playboyS1 = new Sectiune("Front Cover");
//		playboyS1.add(img1);
//		Sectiune playboyS2 = new Sectiune("Summer Girls");
//		playboyS2.add(img2);
//		playboyS2.add(img3);
//		Carte playboy = new Carte("Playboy");
//
//		playboy.addContent(playboyS1);
//		playboy.addContent(playboyS2);
//		long endTime = System.currentTimeMillis();
//		System.out.println("Creation of the content took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing of the section 1 took " + (endTime -
//		startTime) + " milliseconds");
//		startTime = System.currentTimeMillis();
//		playboyS1.print();
//		endTime = System.currentTimeMillis();
//		System.out.println("Printing again the section 1 took " + (endTime -
//		startTime) + " milliseconds");

//		Carte myBook = new Carte("Laboratorul 4");
//		Autor autor = new Autor("Seby barosanu");
//		myBook.setAutor(autor);
//		Sectiune cap1= new Sectiune("Capitolul 1");
//		Sectiune cap11= new Sectiune("Capitolul 1.1");
//		Sectiune cap111= new Sectiune("Capitolul 1.1.1");
//		Sectiune cap1111= new Sectiune("Capitolul 1.1.1.1");
//		myBook.addContent(new Paragraf("Astazi este o zi frumoasa"));
//		myBook.addContent(cap1);
//		cap1.add(new Paragraf("Moto capitol"));
//		cap1.add(cap11);
//		cap11.add(new Paragraf("Text din subcapitol 1.1"));
//		cap11.add(cap111);
//		cap111.add(new Paragraf("Text din subcapitol 1.1.1"));
//		cap111.add(cap1111);
//		cap1111.add(new Imagine("Imagine subcapiol 1.1.1.1"));
//		cap1111.add(new Tabel("testam"));
//		int indexCapitol = myBook.setCapitol("Capitol unu");
//		Capitol capitolUnu = myBook.getCapitol(indexCapitol);
//		int indexSubcapitol = capitolUnu.setSubcapitol("Subcapitol unu");
//		Subcapitol capitolUnuUnu = capitolUnu.getSubcapitol(indexSubcapitol);
//		int indexImagine = capitolUnuUnu.setImagine("Imagine 1");
//		int indexParagraf = capitolUnuUnu.setParagraf("Paragraf 1");
//		capitolUnuUnu.setParagraf("Paragraf 2");
//		capitolUnuUnu.setParagraf("Paragraf 3");
//		capitolUnuUnu.setParagraf("Paragraf 4");
//		capitolUnuUnu.setImagine("Imagine 4")
//		int indexTabel = capitolUnuUnu.setTabel("Tabel 1");
		//myBook.print();
		
		
		
		Sectiune cap1 = new Sectiune("Capitolul 1");
		Paragraf p1 = new Paragraf("Paragraph 1");
		cap1.add(p1);
		Paragraf p2 = new Paragraf("Paragraph 2");
		cap1.add(p2);
		Paragraf p3 = new Paragraf("Paragraph 3");
		cap1.add(p3);
		Paragraf p4 = new Paragraf("Paragraph 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new AlignCenter());
		p2.setAlignStrategy(new AlignRight());
		p3.setAlignStrategy(new AlignLeft());
		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();
	}
}
