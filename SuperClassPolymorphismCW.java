package week2.day3.oopsconcept;

public class SuperClassPolymorphismCW {
	
	public void Subjects() {
		System.out.println("Number of subjects in superclass is 5");
	}
	public void Students() {
		System.out.println("Number of students in a class is 40");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClassPolymorphismCW scpcw = new SuperClassPolymorphismCW();
		scpcw.Subjects();
		scpcw.Students();
	}

}
