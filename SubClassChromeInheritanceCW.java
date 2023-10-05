package week2.day3.oopsconcept;

public class SubClassChromeInheritanceCW extends BroswerClassInheritanceCW{
	
	public void OpenIncognito() {
		System.out.println("Open the URL in Newwindow");
		}
     public void ClearCache() {
    	 System.out.println("Clear the cache");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClassChromeInheritanceCW chromeinhertiance = new SubClassChromeInheritanceCW();
		chromeinhertiance.OpenIncognito();
		chromeinhertiance.ClearCache();
		chromeinhertiance.OpenURL();
		chromeinhertiance.CloseBrowser();
		chromeinhertiance.NavigateBack();
	}

}
