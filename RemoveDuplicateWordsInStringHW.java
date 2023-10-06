package week2.day2.stringconceptshw;

public class RemoveDuplicateWordsInStringHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "We learn java basics as part of java sessions in java week1";
		String[] split = sentence.split(" ");
		String remvewords = "";
		for (int i = 0; i < split.length; i++) {
			for (int j = i + 1; j < split.length; j++) {
				if (split[i].equals(split[j])) {
					split[j] = "";
				}
			}
			remvewords = remvewords + split[i] + " ";
			
		}
		System.out.println("Duplicate removed string is : " + remvewords);
		
		
		/*
		 * for (int k = 0; k < split.length; k++) { if (split[k] != "") { remvewords =
		 * remvewords + split[k] + " "; } }
		 * 
		 * System.out.println("Duplicate removed string is : " + split[k] + " ");
		 */

		

	}

}
