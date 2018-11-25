
public class EnginePower extends CarWorkShop {
	
	public EnginePower() {
		
	}

	@Override
	public void changeCarPref(SerialCar car) {
		
		this.car = car;
		System.out.println("Increasing engine power....");
		
	}

	@Override
	public String description() {
		
		return this.car.description() +" with increased engine power";
	}
	
	

}
