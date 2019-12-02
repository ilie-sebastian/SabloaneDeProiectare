
public class FirstObserver implements Observer {

	@Override
	public void update(String oldValue, String newValue) {
		System.out.println("First observer,old value =  " + oldValue + " ,new value = " +newValue);
	}

}
