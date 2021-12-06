import java.util.ArrayList;
import java.util.Scanner;

public class Assignment8{
    public static void main(String[] args){
        System.out.println("********************************************************************");
        //Initializing the array list for the countries.
        ArrayList<String> Countries = new ArrayList<>();

        Countries.add("USA");
        Countries.add("UK");
        Countries.add("Australia");
        Countries.add("Japan");
        Countries.add("Singapore");
        Countries.add("Sri Lanka");
        Countries.add("France");
        Countries.add("Canada");
        //Initializing the array list for the respective capitals.
        ArrayList<String> Capitals = new ArrayList<>();
        Capitals.add("Washington DC");
        Capitals.add("London");
        Capitals.add("Canberra");
        Capitals.add("Tokyo");
        Capitals.add("Singapore");
        Capitals.add("Colombo");
        Capitals.add("Paris");
        Capitals.add("Ottowa");

        System.out.println("List of countries to choose from: " + Countries);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a country from the list above and I will tell you the name of its capital city (Case-Sensitive): ");
        System.out.println();

        String userInput = sc.nextLine();
        //Searches through the Countries ArrayList and stops as soon as it finds an element that matches with the user input.
        //Stores the index at which it found the user input and then looks for the element in the Capitals ArrayList in order to print the respective Capital City.
        //Includes an error handling "else if" statement which exists in case the user enters an invalid country.
        boolean countryFlag = false;
        for (int i = 0; i < Countries.size(); i++) {
            if (userInput.equals(Countries.get(i))) {
                System.out.println("The capital of " + Countries.get(i) + " is " + Capitals.get(i) + ".");
                countryFlag = true;
                break;
            }else{
                //The line below tells the for loop to keep going, or in technical terms, continue.
                continue;
            }
        }

            if(countryFlag == false){
                System.out.println("I do not recognize that country. Valid countries are the following: " + Countries);
            }
        System.out.println();
        System.out.println("********************************************************************");
    }
}
