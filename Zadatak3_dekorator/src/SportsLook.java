
public class SportsLook extends CarWorkShop {

	public SportsLook() {
		
	}


	@Override
	public void changeCarPref(SerialCar car) {
		
		this.car = car;
		System.out.println("Adding sports look....");
		
	}

	@Override
	public String description() {
		
		return this.car.description() +" with sports look";
	}

}
