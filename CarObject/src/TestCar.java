
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car("Mufarreh");
		
		System.out.println(car1.getName());

		car1.setName("Mufarreh");
		
		car1.setTopSpeed(90.5);
		
		System.out.println(car1.getTopSpeedMPH());
		
		System.out.println(car1.getTopSpeedKMH());

	}

}
