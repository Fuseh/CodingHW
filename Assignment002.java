import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number between 1 and 10");

        Integer asterisk = input.nextInt();
        if(asterisk > 10){
            System.out.println("You have entered an invalid number. Shutting down...");
            System.exit(0);
        }
        else if(asterisk < 1){
            System.out.println("You have entered an invalid number. Shutting down...");
            System.exit(0);
        }
        else{
            System.out.println("You have entered " + asterisk + ". Continuing...");
        }
        for(int i = asterisk; i > 0; i--){
            int j = 0;
            while(j < i){
                System.out.print("*");
                j += 1;
            }
            System.out.println();
        }
    }
}
