
public class TintedGlass extends CarWorkShop {

	@Override
	public void changeCarPref(SerialCar car) {
		
		this.car = car;
		System.out.println("Adding tinted glass....");
		
	}

	@Override
	public String description() {
		
		return this.car.description() +" with tinted glass";
	}

}
