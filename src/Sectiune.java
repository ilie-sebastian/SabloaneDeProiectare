import java.util.ArrayList;

public class Sectiune implements Element {
	private String titlu;
	private ArrayList<Element> listaElemente = new ArrayList<Element>();
	public Sectiune() {
		
	}
	public Sectiune(String t) {
		this.titlu = t;
	}
	public int add(Element e)
	{
		this.listaElemente.add(e);
		return this.listaElemente.indexOf(e);
	}
	public void remove(Element e) {
		this.listaElemente.remove(e);
	}
	public Element getElement(int index)
	{
		return this.listaElemente.get(index);
	}
	public void print() {
		System.out.println("Titlu:"+ titlu);
		for(int i=0;i<listaElemente.size();i++)
		{
			listaElemente.get(i).print();
		}
	}
}
