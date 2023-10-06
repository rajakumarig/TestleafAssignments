package week2.day3.oopsconceptHW;

public class MethodOverloadHW {
	
	public void getStudentInfo(int id) {
		System.out.println("The ID of the student is : " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("The ID of the student is : " + id);
		System.out.println("The Name of the student is : " + name);
	}
	
	public void getStudentInfo(long phnumber, String email) {
		System.out.println("The Email ID of the student is : " + email);
		System.out.println("The Phonenumber of the student is : " + phnumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadHW mohw = new MethodOverloadHW();
		mohw.getStudentInfo(1);
		mohw.getStudentInfo(2,"Rajakumari");
		mohw.getStudentInfo(9962183200L,"rajakumarig91@gmail.com");
	}

}
