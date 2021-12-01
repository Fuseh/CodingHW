import java.util.Scanner;

public class Assignment6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer and I will print that integer to zero in reverse order!");

        int userInput = sc.nextInt();
        for(int i = userInput; i >= 0; i--){
            System.out.print(i);
            System.out.print(" ");
        }

    }
}