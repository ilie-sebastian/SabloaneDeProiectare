
public interface Element {
	public void print();
	public void accept(Visitor vis);
	public void setNewValue(String newValue);
}
