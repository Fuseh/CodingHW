import java.util.Scanner;
import java.lang.Math;

public class Assignment16 {
    public static void main(String[] args) {
        System.out.println("***********************************************************************************************************************");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 9: ");
        int userInput = sc.nextInt();
        int count = 1;
        System.out.println();
        //Method without recursion (refer to lines 23-34):
        System.out.println("This is the method that does not rely on recursion: " + mathIsFun(userInput));

        //Method using recursion (refer to lines 37-46):
        System.out.println("This is the method using recursion: " + mathIsVeryFun(count, userInput));

        System.out.println();
        System.out.println("***********************************************************************************************************************");
    }

    //Method without recursion
    public static int mathIsFun(int userInput) {

        int count = 0;
        if (userInput < 1 || userInput > 9) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        for (int i = 1; i < userInput + 1; i++) {
            count += Math.pow(i, i);
        }
        return count;
    }

    //Method with recursion
    public static double mathIsVeryFun(int count, int userInput) {
        if(count < userInput + 1){
            return Math.pow(count, count) + mathIsVeryFun(count + 1, userInput);
        }
        else{
            return 0;
        }

    }
}
