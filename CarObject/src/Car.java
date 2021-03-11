
public class Car {

	private String name;
	private double topSpeed;

	Car () {
		
	}
	Car (String newName){
		
	    name = newName;
	    
	}

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String newName) {
		name = newName;
	}

	// Setter
	public void setTopSpeed(double newTopSpeed) {
		topSpeed = newTopSpeed;
	}

	// Getter
	public double getTopSpeedMPH() {
		return topSpeed;
	}

	// Getter
	public double getTopSpeedKMH() {
		return topSpeed;
	}
}
