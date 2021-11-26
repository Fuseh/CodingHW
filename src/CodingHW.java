import java.util.Scanner;
public class CodingHW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number between 1 and 30");

        Integer asterisk = input.nextInt();
        System.out.println("You have entered " + asterisk + " as your number. I will now print it in asterisks:");
        System.out.println();
        for(int i = 0; i < asterisk; i++){
            System.out.print("*");
        }

        System.out.println();
        System.out.println();
        System.out.println(asterisk + " asterisks were just displayed on the screen!");
        System.out.println("Goodbye and thank you for playing my game! :)");
    }
}