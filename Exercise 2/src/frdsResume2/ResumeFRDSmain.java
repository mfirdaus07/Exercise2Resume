package frdsResume2;

/*
 * Mohammad Firdaus Bin Azman (275459)
 */

public class ResumeFRDSmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Resume\n");
		
		Biodata bio = new Biodata(); 
		CalculateCGPA gp = new CalculateCGPA();
		Result r = new Result();
		WorkExp w = new WorkExp();
		Skills s = new Skills();
		Award a = new Award();
		
		bio.displayBio();
		r.displayResult();
		gp.displayGPA();
		w.displayWork();
		s.displaySkills();
		a.displayAward();
		
		
	}

}
