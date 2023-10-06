package week2.day2.stringconceptshw;

public class ReverseEvenWords {

	public static void main(String[] args) {

		// Split the given string into words and store it in a array
		// and print the words

		String osent = "I am a software tester"; // I ma a erawtfos tester
		String words[] = osent.split(" ");
		String reveresedstring = "";

		// odd index within the loop (use mod operator)
		// Split these words and have it in a array.
		for (int i = 0; i < words.length; i++) {
			String currentstring = words[i];
			String currentword = "";
			if (i % 2 == 1) {
				System.out.println("The Even index values are :" + i);
				for (int j = currentstring.length() - 1; j >= 0; j--) {
					currentword = currentword + currentstring.charAt(j);
				}
			} else {
				currentword = currentstring;
				System.out.println("The odd index values are :" + i);
			}
			reveresedstring = reveresedstring + currentword + " ";
			System.out.println("The reversed string is : " + reveresedstring);
		}

	}

}
