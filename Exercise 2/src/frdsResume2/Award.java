package frdsResume2;

public class Award {
	String cert; 

	Award(){
	}
	
	Award(String a){
		this.cert = a;
	}
	
	public void displayAward() {
		System.out.println("\nAward : ");
		Award aw1 = new Award("Malaysia University English Test - Band 3");
		System.out.println("\t 1." + aw1.cert);
	}
}
