
public class HybridPower extends CarWorkShop {

	

	@Override
	public void changeCarPref(SerialCar car) {
		
		this.car = car;
		System.out.println("Adding hybrid power extensions....");
		
	}

	@Override
	public String description() {
		
		return this.car.description() +" with hybrid power extesions";
	}


}
