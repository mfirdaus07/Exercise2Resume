package frdsResume2;

public class Result {
	String subject;
	String lang;
	char grade;
	
	Result(){
		this.subject = "STIA 1113";
		this.lang = "C++";
		this.grade = 'A';
	}
	
	Result(String s, String l, char g){
		this.subject = s;
		this.lang = l;
		this.grade = g;
	}
	
	public void displayResult() {
		Result rs = new Result();
		System.out.println("\nProgramming Language Result");
		System.out.println("\nSubject " + rs.subject + "\nProgram Language : " + rs.lang + "\nExam Result : " + rs.grade + "\n");
	}
}
