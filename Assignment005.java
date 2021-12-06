import java.util.Scanner;
public class Assignment5{
    public static void main(String[] args) {
        System.out.println("*************************************************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive integer and I will count up from one to that integer!");

        Integer userInput = sc.nextInt();
        System.out.println();
        System.out.print("Counting up from 1 to " + userInput + ": ");
        for(int i = 1; i < userInput; i++){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println(userInput);
        System.out.println();
        System.out.println("Cool! Enter another number and I will count up from one to that integer.");
        userInput = sc.nextInt();
        System.out.println();
        int i = 0;
        while(i < userInput){
            i++;
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Thank you for your time!");
    }
}
