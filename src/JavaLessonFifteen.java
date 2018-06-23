public class JavaLessonFifteen {
	
	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(4, 100.00);
		
		System.out.println("Car's Max Speed " + car.getSpeed());
		System.out.println("Car's Number of Wheels " + car.getWheel());
		
		car.setCarStrength(10);
		System.out.println("Car's Strength " + car.getCarStrength());
	}
}