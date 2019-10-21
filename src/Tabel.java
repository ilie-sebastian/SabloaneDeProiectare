
public class Tabel implements Element {
	private String nume;

	public Tabel() {
		
	}
	public Tabel(String nume) {
		this.nume = nume;
	}
	public void print() {
		System.out.println("Tabel: "+ nume);
	}
}
