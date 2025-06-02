package TaskActivities;



interface Animal {
	boolean feed(boolean timeToEat);
	void groom();
	void pet();
	void cage();
}

class Gori implements Animal {
	
	@Override
	public boolean feed(boolean timeToEat) {
		return timeToEat;
	}
	
	@Override
	public void groom() {
		System.out.println("lather, rinse, repeat");
	}
	
	@Override
	public void pet() {
		System.out.println("pet at your own risk");
	}
	
	@Override
	public void cage() {
		System.out.println("put gorilla food into cage");
	}

}

public class Task16 {

    	public static void main(String[] args) {
		var gori = new Gori();
		System.out.println("Time to eat: " + gori.feed(true));
		gori.groom();
		gori.pet();
		gori.cage();
	}
}


