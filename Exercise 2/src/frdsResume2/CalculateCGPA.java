package frdsResume2;

public class CalculateCGPA {
	double cgpa;
	double[] gpa = new double[4];
	double total;
	double average;
	
	CalculateCGPA(){
		this.cgpa = 2.16;
		this.gpa = new double [] {3.45, 3.66, 3.54, 3.72};		
	}
	
	CalculateCGPA(double bioCGPA, double bioGPA[]){
		this.cgpa = bioCGPA;
		this.gpa = bioGPA;
	}
	
	public double calCGPA() {
		for (int i = 0; i < gpa.length; i++) {
			total+=gpa[i];
		}
		return average;
	}
	public void displayGPA() {
		for (int i = 0; i < gpa.length; i++) {
			System.out.println("Sem " + (i + 1) + " : " + gpa[i]); 
		}
		System.out.println("CGPA : " + cgpa); 
	}
}
