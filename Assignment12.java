import java.util.Scanner;
import java.util.Arrays;

public class Assignment12{
    public static void main(String[] args){
        System.out.println("********************************************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your five favorite dishes below: ");
        String Dishes = sc.nextLine();

        String[] favDishes = new String[5];
        favDishes[0] = Dishes;

        Dishes = sc.nextLine();
        favDishes[1] = Dishes;

        Dishes = sc.nextLine();
        favDishes[2] = Dishes;

        Dishes = sc.nextLine();
        favDishes[3] = Dishes;

        Dishes = sc.nextLine();
        favDishes[4] = Dishes;
        System.out.println();
        System.out.print("These are your favorite dishes: ");
        System.out.print(Arrays.toString(favDishes));
        
        System.out.println("********************************************************************");
    }
}
