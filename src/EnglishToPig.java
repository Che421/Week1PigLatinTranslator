import java.util.Scanner;

public class EnglishToPig {
	public static void main(String[] args) {
		Scanner userWord = new Scanner(System.in);

		System.out.println("Welcome to the Pig Latin Translator!");
		String userChoice;

		do {
			System.out.println("Please enter a word into the Translator:  ");
			String enter = userWord.nextLine();
			enter = enter.toLowerCase();

			System.out.println(engToPig(enter));
			
			System.out.println("Do you want to enter another word in to the Translator? Yes or No?");
			userChoice = userWord.nextLine();	
			
		} while (userChoice.equalsIgnoreCase("Yes"));

		System.out.println("Thank you for using the Pig Latin Translator");

		userWord.close();
	}

	public static String engToPig(String word) {
		char firstLetter = word.charAt(0);
		if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o'
				|| firstLetter == 'u') {
			word = word.concat("way");
		} else {
			word = word.substring(1);
			word = word + firstLetter + "ay";
		}
		return word;

	}
}
