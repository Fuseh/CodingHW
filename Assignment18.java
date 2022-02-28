import java.util.HashMap; //Import this class in order to utilize HashMap's
import java.util.Scanner;

public class Assignment18{
    public static void main(String[] args){
        System.out.println("********************************************************************");
        System.out.println("Welcome to my website!!! Setup a login so you can meet other people. ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username you want to use: ");
        String userName = sc.nextLine();
        System.out.println("Great! Now enter a secure password that you can remember: ");
        String userPass = sc.nextLine();

        //Initialize HashMap as shown below.
        HashMap<String, String> database = new HashMap<String, String>();
        database.put("bobbyJoe1996", "FluffyP0nies!");
        database.put("HelloKittyFan21", "AloeVera?!");
        database.put("coolguyswag", "password123!");
        database.put("PringleLover54", "ChiPz4DAyz");
        database.put("FrenchBaguette", "RIPGRAMPS2019");

        //Note: "Key" is the element on the left of the comma and "Value" is the element on the right of the comma.
        //This method returns an error message if the username the user entered already exists in the database.
        boolean existingUser = false;
        if(database.containsKey(userName)){
            System.out.println("Sorry, that username already exists. Please try again!");
            existingUser = true;
        }

        //Error handling for weak password.
        if(existingUser == false){
            if(userPass.length() > 8 && userPass.contains("!")){
                database.put(userName, userPass);
                System.out.println();
                System.out.println("Congratulations! You have successfully setup an account and your credentials have been saved in the database.");
            }
            else{
                System.out.println("Your password is too weak. Please choose a stronger password (8 alphanumeric characters and at least one symbol)");
            }
        }

        System.out.println("********************************************************************");
    }
}
