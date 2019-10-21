
public class TestCarte {
	public static void main(String []args)
	{
		Carte myBook = new Carte("Laboratorul 4");
		Autor autor = new Autor("Seby barosanu");
		myBook.setAutor(autor);
		Sectiune cap1= new Sectiune("Capitolul 1");
		Sectiune cap11= new Sectiune("Capitolul 1.1");
		Sectiune cap111= new Sectiune("Capitolul 1.1.1");
		Sectiune cap1111= new Sectiune("Capitolul 1.1.1.1");
		myBook.addContent(new Paragraf("Astazi este o zi frumoasa"));
		myBook.addContent(cap1);
		cap1.add(new Paragraf("Moto capitol"));
		cap1.add(cap11);
		cap11.add(new Paragraf("Text din subcapitol 1.1"));
		cap11.add(cap111);
		cap111.add(new Paragraf("Text din subcapitol 1.1.1"));
		cap111.add(cap1111);
		cap1111.add(new Imagine("Imagine subcapiol 1.1.1.1"));
		cap1111.add(new Tabel("testam"));
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
		myBook.print();
	}
}
