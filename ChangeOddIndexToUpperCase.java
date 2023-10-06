package week2.day2.stringconceptshw;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "changeme";
		String updatedstring = "";
		char chararr[] = test.toCharArray();
		for(int i=0;i<chararr.length;i++) {
			char c = chararr[i];
			if(i%2==1) {
				c=Character.toUpperCase(c);
				updatedstring=updatedstring+c;
			}else {
			updatedstring=updatedstring+c;
			}
		}
       System.out.println("Updated string is"+updatedstring);
	}

}
