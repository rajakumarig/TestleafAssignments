package week2.day3.oopsconceptHW;

public class ChildClassSingleInheritanceHW extends ParentClassSingleInheritanceHW{
	
	public void DesktopSize() {
		System.out.println("The Size of the desktop is 18GB");
	}
	
	public void DesktopName() {
		System.out.println("The Desktop name is ACER");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassSingleInheritanceHW childclass = new ChildClassSingleInheritanceHW();
		childclass.Camera();
		childclass.DesktopName();
		childclass.DesktopSize();
		childclass.LaptopName();
		childclass.LaptopModel();
	}

}
