
public class App {

	public static void main(String[] args) {

		SerialCar car = new Car();
		
		EnginePower ep = new EnginePower();
		ep.changeCarPref(car);
		System.out.println(ep.description());
		
		SportsLook sl = new SportsLook();
		sl.changeCarPref(ep);
		System.out.println(sl.description());
		
		HybridPower hp = new HybridPower();
		hp.changeCarPref(sl);
		System.out.println(hp.description());
		
		TintedGlass tg = new TintedGlass();
		tg.changeCarPref(hp);
		System.out.println(tg.description());
		
		

	}

}
