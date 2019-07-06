package staticPackage;

public class Car {
	
	private static int carWheels = 4 ;
	
//	private static int countInstances ;
	private static int countInstances ;
	
	private String nameCar;

	public static int getCarWheels() {
		return carWheels;
	}

	public static void setCarWheels(int carWheels) {
		Car.carWheels = carWheels;
	}

	/*public static int getCountInstances() {
		return countInstances;
	}

	public static void setCountInstances(int countInstances) {
		Car.countInstances = countInstances;*/
//	}

	public String getNameCar() {
		return nameCar;
	}

	public void setNameCar(String nameCar) {
		this.nameCar = nameCar;
	}

	public Car(String nameCar) {

		this.nameCar = nameCar;
		countInstances++;
	}
	
	

}
