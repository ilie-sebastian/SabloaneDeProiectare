
public class Autor {
	private String nume;

	public Autor() {
		
	}
	public Autor(String nume)
	{
		this.nume = nume;
	}
	public void print() {
		System.out.println( "Autor: " + nume);
	}
}
