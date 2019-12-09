import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Imagine implements Element,Observable {
	private String oldNume;
	private String nume;
	private ArrayList<Observer> observersList = new ArrayList<Observer>();
	public Imagine() {
		
	}
	public Imagine(String nume)
	{
		this.nume = nume;
		addObserver(DocumentManager.getInstance().getFirstOberver());
		addObserver(DocumentManager.getInstance().getSecondOberver());
		try {
			TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
	}
	public Imagine copy()
	{
		return new Imagine(this.nume);
	}
	public void print() {
		System.out.println("Imagine: " + nume );
	}
	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visit(this);
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
			obs.update(this.oldNume,this.nume);
		}
		
	}
	@Override
	public void setNewValue(String newValue) {
		// TODO Auto-generated method stub
		this.oldNume = this.nume;
		this.nume = newValue;
		notifyObservers();
	}

}
