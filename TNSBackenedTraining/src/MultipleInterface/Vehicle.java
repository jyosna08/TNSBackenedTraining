package MultipleInterface;
// Demo for Multiple Inheritance
public class Vehicle {
	
	public void DriveUsingCng() {
		System.out.println("Driving Cng Vehicle");
		
	}
	
	public void DriveUsingPetrol() {
		System.out.println("Driving Petrol Vehicle");
	}
	
	
	// main
	public static void main(String args[]) {
		
		// Instance for Vehicle created 
		Vehicle v=new Vehicle();
		v.DriveUsingCng();
		v.DriveUsingPetrol();
	}

}
