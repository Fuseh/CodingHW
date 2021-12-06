import java.util.Scanner;
import java.util.Arrays;
public class Assignment3 {
    public static void main(String[] args) {
        System.out.println("********************************************************************");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any positive/negative integer as your first value: ");
        int value1 = sc.nextInt();

        System.out.println("Enter any positive/negative integer as your second value: ");
        int value2 = sc.nextInt();

        System.out.println("Enter any positive/negative integer as your third value: ");
        int value3 = sc.nextInt();

        //Initializing the array and setting the values in it to the three inputs the user entered.
        int[] Array = new int[]{ value1, value2, value3 };
        System.out.print("Array: ");
        System.out.println(Arrays.toString(Array));
        System.out.println();

        int sum = value1 + value2 + value3;
        System.out.println("The sum of the array is: " + sum);
        int average = (sum/3);
        System.out.println("The average of the array is: " + average);

        System.out.println();
        System.out.println("Thank you for your time!");
        System.out.println("********************************************************************");

    }
}
