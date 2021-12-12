import java.util.Scanner;
import java.util.Arrays;

public class Assignment11{
    public static void main(String[] args){
        System.out.println("********************************************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 9: ");
        int userInput = sc.nextInt();

        String[] planets = new String[] {"", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};


        boolean recognizedInteger = true;

        if(userInput < 1 || userInput > 9){
            recognizedInteger = false;
        }

        if(recognizedInteger){
            for(int i = 9; i >= 0; i--){
                System.out.println("Planet #" + userInput + " in our solar system is: " + planets[userInput] + "!");
                recognizedInteger = false;
                System.exit(0);
            }
        }
        //Listing planets in reverse order
        System.out.print("The number you entered was out of range. Here are the planets in reverse order: ");
        if(recognizedInteger == false){
            for(int i = 9; i >= 0; i--){
                System.out.print(planets[i] + " ");
            }
        }



        System.out.println();
        System.out.println();
        System.out.println("********************************************************************");
    }
}
