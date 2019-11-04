
public class Paragraf implements Element {
	private String nume;
	private AlignStrategy AlignStrategy;
	
	public Paragraf()
	{
		
	}
	public Paragraf(String nume)
	{
		this.nume = nume;
	}
	public void print() {
		if(this.AlignStrategy !=null)
		{
			this.AlignStrategy.print(this.nume);
		}
		else
		{
			System.out.println("Paragraf: " + this.nume);
		}
	}
	public AlignStrategy getAlignStrategy() {
		return AlignStrategy;
	}
	public void setAlignStrategy(AlignStrategy type) {
		this.AlignStrategy = type;
	}
}
