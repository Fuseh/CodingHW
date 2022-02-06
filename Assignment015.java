import java.util.Scanner;

public class Assignment15{
    public static void main(String[] args){
        System.out.println("***********************************************************************************************************************");
        //Word, Character & Sentence count function in Google Docs.

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a message below and I will count the number of words, characters, and sentences in it: ");
        String userInput = sc.nextLine();

        //initialize the 2 variables.
        //character count does not need to be initialized as there is already a method for that.
        int wordCount = 1;
        int sentences = 1;


        for (int i = 0; i < userInput.length() - 1; i++)
        {
            //"charAt" acts as similarly to the "indexOf" method in Arrays.
            //Use singular quotations for character methods.
            if ((userInput.charAt(i) == ' ') && (userInput.charAt(i + 1) != ' '))
            {
                wordCount++;
            }
        }

        for (int i = 0; i < userInput.length() - 1; i++)
        {
            //"charAt" acts as similarly to the "indexOf" method in Arrays.
            if ((userInput.charAt(i) == '.') && (userInput.charAt(i + 1) != '.'))
            {
                sentences++;
            }
        }


        System.out.println("The number of words in your message is: " + wordCount);
        System.out.println("The number of characters in your message is: " + userInput.length());
        System.out.println("The number of sentences in your message is: " + sentences);
        System.out.println("***********************************************************************************************************************");
    }
}
