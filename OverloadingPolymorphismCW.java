package week2.day3.oopsconcept;

public class OverloadingPolymorphismCW {
	
	public void reportStep(String strmsg, String strstatus) {
		System.out.println("ReportStep method passed with 2 arguments as a parameter");
	}
	
	public void reportStep(String strmsg, String strstatus, Boolean snap) {
		System.out.println("ReportStep method passed with 3 arguments as a parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingPolymorphismCW polyoverload = new OverloadingPolymorphismCW();
		polyoverload.reportStep("Raji", "Passed");
		polyoverload.reportStep("Raji", "Failed", false);
	}

}
