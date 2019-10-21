
public class Paragraf implements Element {
	private String nume;
	public Paragraf()
	{
		
	}
	public Paragraf(String nume)
	{
		this.nume = nume;
	}
	public void print() {
		System.out.println("Paragraf: " + nume);
	}
	
}
