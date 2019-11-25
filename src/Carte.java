import java.util.ArrayList;
import java.util.Arrays;

public class Carte {
	
	private String nume;
	private ArrayList<Autor> listaAutori = new ArrayList<Autor>();
	private ArrayList<Element> listaElemente = new ArrayList<Element>();

	public Carte(String nume)
	{
		this.nume = nume;
	}
	public void setAutor(Autor autor)
	{
		if(autor != null) {
		this.listaAutori.add(autor);
		}	
	}
	public void addContent(Element e) {
		this.listaElemente.add(e);
	}
	public void print() {
		System.out.println("Carte: "+nume);
		System.out.println("Autori:");
		for(int i=0;i<listaAutori.size();i++) {	
			listaAutori.get(i).print();
		}
		for(int i=0;i<listaElemente.size();i++)
		{
			listaElemente.get(i).print();
		}
	}
	public Element getContent(int index)
	{
		return this.listaElemente.get(index);
	}


}
