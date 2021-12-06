import java.util.Scanner;

public class Assignment6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer and I will count down from that integer to zero!");

        int userInput = sc.nextInt();
        for(int i = userInput; i >= 0; i--){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        System.out.println("Cool! Enter another number and I will count down from that number to zero.");
        userInput = sc.nextInt();

        int i = userInput;
        while(i >= 0){
            System.out.print(i);
            System.out.print(" ");
            i--;
        }
        System.out.println();
        System.out.println("Thank you for your time! :]");

    }
}
