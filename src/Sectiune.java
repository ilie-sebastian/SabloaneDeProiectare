import java.util.ArrayList;

public class Sectiune implements Element,Observable {
	private String oldTitlu;
	private String titlu;
	private ArrayList<Element> listaElemente = new ArrayList<Element>();
	private ArrayList<Observer> observersList = new ArrayList<Observer>();
	public Sectiune() {
		
	}
	public Sectiune(String t) {
		this.titlu = t;
		addObserver(DocumentManager.getInstance().getFirstOberver());
		addObserver(DocumentManager.getInstance().getSecondOberver());
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
	public Element getLastElement()
	{
		if(this.listaElemente.size() > 0)
		{
			return this.listaElemente.get(this.listaElemente.size() -1 );
		}
		else
		{
			return null;
		}
	}
	public void print() {
		System.out.println("Titlu:"+ titlu);
		for(int i=0;i<listaElemente.size();i++)
		{
			listaElemente.get(i).print();
		}
		
	}
	@Override
	public void accept(Visitor vis) {
		for (Element el:listaElemente)
		{
			el.accept(vis);
			
		}
	}
	@Override
	public void addObserver(Observer obs) {
		// TODO Auto-generated method stub
		this.observersList.add(obs);
		
	}
	@Override
	public void removeObserver(Observer obs) {
		// TODO Auto-generated method stub
		this.observersList.remove(obs);
		
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer obs : this.observersList)
		{
			obs.update(this.oldTitlu, this.titlu);
		}
	}
	@Override
	public void setNewValue(String newValue) {
		// TODO Auto-generated method stub
		this.oldTitlu = this.titlu;
		this.titlu = newValue;
		notifyObservers();
		
	}
	@Override
	public Element copy() {
		// TODO Auto-generated method stub
		Sectiune s = new Sectiune(this.titlu);
		
	
		 this.listaElemente.forEach(p -> {
			 s.add(p.copy());
		 });
		return s;
	}
	
}
