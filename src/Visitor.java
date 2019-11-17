
public interface Visitor {
	public void visit(Imagine img);
	public void visit(ImagineProxy imgProxy);
	public void visit(Paragraf paragraf);
	public void visit(Tabel tabel);
}
