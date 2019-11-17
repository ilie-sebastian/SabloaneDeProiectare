
public class BookCost extends BookStatistic {
	private int costImg = 2;
	private int costPar = 4;
	private int costTab = 3;
	
	public void printStatisticsCost()
	{
		super.printStatistics();
		System.out.println("Costul per imagine: " + this.costImg + " costul total: " + this.costImg*getNrImagini());
		System.out.println("Costul per tabel: " + this.costTab + " costul total: " + this.costTab*getNrTab());
		System.out.println("Costul per paragraf: " + this.costPar + " costul total: " + this.costPar*getNrPar());
	}
}
