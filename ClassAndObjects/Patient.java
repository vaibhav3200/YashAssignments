//Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. 
//The following are the details.
//Name of the class - Patient
//Member Variables - patientName(String),height(double),weight(double)
//Member Function - double computeBMI()
//The above method should compute the BMI and return the result. The formula for computation of BMI  
//is weight (in kg) ÷ height*height(in meters).
//Create an object of the Patient class and check the results.

package ClassAndObjects;

public class Patient {
	private String patientName;
	private double height;
	private double weight;

	public Patient(String patientName, double height, double weight) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double computeBMI() {
		return weight / (height * height);
	}
	
	public static void main(String[] args) {
		Patient patient = new Patient("Yash", 75, 60);
		System.out.println("patient:"+patient.getPatientName()+"\nBMI="+patient.computeBMI());
	}
}
