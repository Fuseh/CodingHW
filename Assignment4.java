import java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        System.out.println("********************************************************************");
        System.out.println("I will print a square of any size, made up of any character that you want! ");
        System.out.println();

        Scanner square = new Scanner(System.in);
        System.out.println("Enter any number between 1 and 25: ");

        Integer number = square.nextInt();

        Scanner character = new Scanner(System.in);
        System.out.println("Enter any character of your choice (ex: !,@,#,$,%): ");

        char symbol = character.next().charAt(0);

        int i, j;
        for(i = 0; i < number; i++){
            for(j = 0; j < number; j++){
                System.out.print(symbol + " ");
            }
            //You can also write the code below as: "System.out.print("/n")" in order to go to the next line.
            System.out.println();
        }


    }
}
