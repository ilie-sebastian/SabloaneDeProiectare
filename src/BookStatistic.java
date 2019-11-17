
public class BookStatistic implements Visitor {
	protected int nrImagini;
	protected int nrPar;
	protected int nrTab;
	
	@Override
	public void visit(Imagine img) {
		// TODO Auto-generated method stub
		if(img != null)
		{
			this.nrImagini++;
		}
	}

	@Override
	public void visit(ImagineProxy imgProxy) {
		// TODO Auto-generated method stub
		if(imgProxy != null)
		{
			this.nrImagini++;
		}
	}

	@Override
	public void visit(Paragraf paragraf) {
		// TODO Auto-generated method stub
		if(paragraf != null)
		{
			this.nrPar++;
		}
	}

	@Override
	public void visit(Tabel tabel) {
		// TODO Auto-generated method stub
		if(tabel != null)
		{
			this.nrTab++;
		}
	}
	
	public int getNrImagini() {
		return nrImagini;
	}

	public void setNrImagini(int nrImagini) {
		this.nrImagini = nrImagini;
	}

	public int getNrPar() {
		return nrPar;
	}

	public void setNrPar(int nrPar) {
		this.nrPar = nrPar;
	}

	public int getNrTab() {
		return nrTab;
	}

	public void setNrTab(int nrTab) {
		this.nrTab = nrTab;
	}

	public void printStatistics()
	{
		System.out.println("*** Number of images: " + this.nrImagini);
		System.out.println("*** Number of tables: " + this.nrTab);
		System.out.println("*** Number of paragraphs: " + this.nrPar);
	}

}
