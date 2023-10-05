package week2.day2.stringconcepts;

public class FindOccureanceofStringCW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strname = "Testleaf";
		char[] CharArray = strname.toCharArray();
		char element = 'e';
		int occurrence = 0;
		
		for(int i=0;i<=CharArray.length-1;i++) 
		{
			if(element==CharArray[i]) {
				occurrence = occurrence+1;
			}
		}
       System.out.println("The element e has occurred " + occurrence + " times in the given string");
       
       int length = strname.length();
       int count = 0;
       for(int i=0; i<length;i++)
       {
       if(CharArray[i]=='e')
       count++;
       }
       System.out.println("Count of e is " + count);
	}

	
}
