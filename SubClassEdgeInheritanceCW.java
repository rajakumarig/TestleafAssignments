package week2.day3.oopsconcept;

public class SubClassEdgeInheritanceCW extends BroswerClassInheritanceCW {
	
	public void TakeSnap() {
		System.out.println("Take a snapshot of the Homepage");
		}
     public void ClearCookies() {
    	 System.out.println("Clear the Cookies from the Browser");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassEdgeInheritanceCW EdgeInherit = new SubClassEdgeInheritanceCW();
		EdgeInherit.TakeSnap();
		EdgeInherit.ClearCookies();
		EdgeInherit.CloseBrowser();
		EdgeInherit.ClearCookies();
		EdgeInherit.NavigateBack();
	}

}
