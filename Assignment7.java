import java.util.Scanner;

public class Assignment7{
    public static void main(String[] args) {
        System.out.println("********************************************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer between zero and nine, and I will display it as a string!");

        Integer userInput = sc.nextInt();
        //Checks if the user entered a valid input.
        if(userInput > 9 || userInput < 0){
            System.out.println("You have entered an invalid number. Exiting...");
            System.exit(0);
        }
        else{
            System.out.println("Great! You entered a valid number.");
        }
        //Initializing Switch Case Statement.
        //Converting Integer to String is not necessary, instead create a new String variable.
        String letterNumber;
        switch (userInput){
            case 1: letterNumber = "One";
                    break;
            case 2: letterNumber = "Two";
                    break;
            case 3: letterNumber = "Three";
                    break;
            case 4: letterNumber = "Four";
                    break;
            case 5: letterNumber = "Five";
                    break;
            case 6: letterNumber = "Six";
                    break;
            case 7: letterNumber = "Seven";
                    break;
            case 8: letterNumber = "Eight";
                    break;
            case 9: letterNumber = "Nine";
                    break;
            //Lines 41 and 42 do not contribute anything to the code, however they are necessary to complete a Switch Case Statement.
            default: letterNumber = "Invalid Month";
                    break;
        }
        System.out.println("Your number as a word: " + letterNumber);
        System.out.println();
        System.out.println("Thank you for your time!");
        System.out.println("********************************************************************");

    }
}
