import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String word2 = "";
        String word3 = "";

        //asks user to input a word
        System.out.print("Enter one word:");
        String word1 = sc.next();
        String oword1 = word1; //creating a copy of the word

        //take each character from the word and reversing it
        for (int i = word1.length(); i >= 0; i--) {
            word2 = word2 + word1.substring(i);
            word1 = word1.substring(0, i);
        }

        //duplicates each character
        for (int i = word2.length()-1; i >= 0; i--) {
            word3= word3 + word2.charAt(0) + oword1.substring(i);
            word2 = word2.substring(1);
            oword1 = oword1.substring(0, i);
        }

        System.out.println("The new word is " + word3);
        

        

	}

}
