
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
	@Override
	public void accept(Visitor vis) {
		// TODO Auto-generated method stub
		vis.visit(this);
		
	}
}
