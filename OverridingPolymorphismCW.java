package week2.day3.oopsconcept;

public class OverridingPolymorphismCW extends SuperClassPolymorphismCW {
	
	public void Collegestudents() {
		System.out.println("Number of students in a college in a section is 45");
	}
	
	public void Subjects() {
		System.out.println("Number of subjects in a particular Department is 8");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingPolymorphismCW orpycw = new OverridingPolymorphismCW();
		orpycw.Collegestudents();
		orpycw.Subjects();
		orpycw.Students();
	}

}
