package project;

import java.util.Scanner;

public class MagicString {
	private Scanner kb = new Scanner(System.in);
	private String string = "";

	public void read(String string){
		if (string != null) {
			this.string = string;
		} else {
			System.out.println("Enter a String: ");
			string = kb.nextLine();
		}
	}

	public boolean isEveryCharacterUniqueN2(){

		for ( int i = 0; i < string.length(); i++) {
			for ( int j = i + 1; j < string.length(); j++){
				if ( string.charAt(i) == string.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isEveryCharacterUniqueUsingHistogram(){
		int[] asciiCount = new int[128];
		for ( int i = 0; i < string.length(); i++) {
			asciiCount[string.charAt(i)]++;
		}
		for (int i = 0; i < asciiCount.length; i++) {
			if (asciiCount[i] > 0) {
				return false;
			}
		}
		return true;
	}


}
