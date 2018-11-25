
public class Car implements SerialCar {
	
	private static final String name= "Car";

	public Car() {
		
		System.out.println("Making serial car....");
	}
	
	
	@Override
	public String description() {
		
		String des = name;
		return des;
	}
	

}
