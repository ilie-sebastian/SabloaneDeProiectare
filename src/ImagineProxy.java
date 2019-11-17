
public class ImagineProxy implements Element {
		private String nume;
		private Imagine img;
		public ImagineProxy(String nume) {
			this.nume = nume;
		}
		public void print()
		{
			if(this.img == null) {
				this.img = new Imagine(this.nume);
			}
			this.img.print();
			
		}
		@Override
		public void accept(Visitor vis) {
			// TODO Auto-generated method stub
			vis.visit(this);
			
		}

}
