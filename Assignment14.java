import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors


public class Assignment14 {
    public static void main(String[] args) {

        ArrayList<String> Country = new ArrayList<>();
        ArrayList<String> Capitals = new ArrayList<>();

        try {
            //Grabs the location of the file
            File myObj = new File("C:\\Users\\pg13f\\Documents\\capitals.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.contains(",")){
                    int point =(data.indexOf(","));
                    String countryName = data.substring(0, point);
                    Country.add(countryName);

                    String capitalName = data.substring(point + 1, data.length());
                    Capitals.add(capitalName.trim());

                }
                //System.out.println(data);
            }

            System.out.println("-------------------------------------------------------------------------------");
            System.out.print("List of countries: ");
            System.out.println(Country);
            System.out.println("-------------------------------------------------------------------------------");
            System.out.print("List of capitals: ");
            System.out.println(Capitals);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Prompting the user to enter a country
        //Return capital city of corresponding country
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter the name of the country you would like know the capital of: ");
        String userInput = sc.nextLine();

        //Error handling
        boolean exists = false;
        for(int i = 0; i < Country.size(); i++){
            if(userInput.equals(Country.get(i))){
                System.out.println();
                System.out.println("The capital city of " + userInput + " is: " + Capitals.get(i) + ".");
                System.out.println("Thank you and have a great day!");
                exists = true;
            }
        }
        if(exists == false){
            System.out.println("The country you entered does not exist in our list. Please try again. Thank you!");
        }

    }
}
