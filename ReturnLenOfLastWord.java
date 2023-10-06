package week2.weekend.javachallengepgm;

public class ReturnLenOfLastWord {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1 = "Hello World";
        String s2 = "fly me  to  the moon";
        String s3 = "luffy is still joyboy";
		 
        
        String[] parts = s1.split(" ");
        String lastword1 = parts[parts.length - 1];
        int len1 = lastword1.length();
        System.out.println("The Last word of String S1 is : " + lastword1 + " with length " + len1);
        
        //s2.trim();
        String lastword2 = s2.substring(s2.lastIndexOf(" ")+1);
		 int len2=lastword2.length();
		 System.out.println("The Last word of String S2 is : " + lastword2 + " with length " + len2);
		 
		 String lastword3 = s3.substring(s3.lastIndexOf(" ")+1);
		 int len3=lastword3.length();
		 System.out.println("The Last word of String S3 is : " + lastword3 + " with length " + len3);
		 

        
	}

}
