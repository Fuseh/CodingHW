import java.util.HashMap;
import java.util.Scanner;

public class Assignment19{
    public static void main(String[] args){
        System.out.println("******************************************************************************************************************************");

        System.out.println("Welcome to the US Presidential Database. Enter a president's name, sequence or year and we will provide details of the commander in chief!!");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Instructions: Type P if you want to search for a President by their name or S if you " +
                           "want to search by their sequential order of service, or Y if you want to search " +
                           "by their term served in years.");

        //Creating boolean variables to better manage user inputs.
        boolean userTypedY = false;
        boolean userTypedP = false;
        boolean userTypedS = false;

        String presidentName = " ";
        int presidentSequence = 0;
        int presidentYear = 0;
        String userInput = sc.nextLine();
        if(userInput.equals("P")){
            System.out.println("Thank you for selecting an option! Now, enter the full name of the President of whom you which to view the details of: ");
            presidentName = sc.nextLine();
            userTypedP = true;
        }
        else if(userInput.equals("S")){
            System.out.println("Thank you for selecting an option! Now, enter which President they were in sequential order (ex. George Washington = 1): ");
            presidentSequence = sc.nextInt();
            userTypedS = true;
        }
        else if(userInput.equals("Y")){
            System.out.println("Thank you for selecting an option! Now, enter the four digit year that the President served their term(s) in: ");
            presidentYear = sc.nextInt();
            userTypedY = true;
        }
        //Error handling.
        else{
            System.out.println("Sorry, we do not recognize that input. Please try again.");
            System.exit(0);
        }

        //Data.
        HashMap<String, String> PresidentialTerm = new HashMap<String, String>();
        PresidentialTerm.put("George Washington", "1789 - 1797");
        PresidentialTerm.put("John Adams", "1797 - 1801");
        PresidentialTerm.put("Thomas Jefferson", "1801 - 1809");
        PresidentialTerm.put("James Madison", "1809 - 1817");
        PresidentialTerm.put("James Monroe", "1817 - 1825");
        PresidentialTerm.put("John Quincy Adams", "1825 - 1829");
        PresidentialTerm.put("Andrew Jackson", "1829 - 1837");
        PresidentialTerm.put("Martin van Buren", "1837 - 1841");
        PresidentialTerm.put("William Henry Harrison", "1841 - 1841");
        PresidentialTerm.put("John Tyler", "1841 - 1845");
        PresidentialTerm.put("James Polk", "1845 - 1849");
        PresidentialTerm.put("Zachary Taylor", "1849 - 1850");
        PresidentialTerm.put("Millard Fillmore", "1850 - 1853");
        PresidentialTerm.put("Franklin Pierce", "1853 - 1857");
        PresidentialTerm.put("James Buchanan", "1857 - 1861");
        PresidentialTerm.put("Abraham Lincoln", "1861 - 1865");


        //For if they choose to search for the President by the year.
        boolean PrezExist = false;
        if(userTypedY) {
            for(String PresidentName : PresidentialTerm.keySet()){
                String term = PresidentialTerm.get(PresidentName);
                //Splitting the year into two separate integers.
                String[] index = term.split("-");
                String tB = index[0].trim();
                String tE = index[1].trim();


                int termBegin = Integer.parseInt(tB);
                int termEnd = Integer.parseInt(tE);

                //Checking if userInput is within a certain President's term.
                if (presidentYear >= termBegin && presidentYear <= termEnd) {
                    System.out.println("There was a President during this time and HIS name was: " + PresidentName);
                    PrezExist = true;
                }

            }
            //Error handling for when a President was not in office during the user-inputted year.
            if(PrezExist == false){
                System.out.println("There was no President during that year. Please enter a year between 1789 to 1865");
            }
        }



        //If they want to find a President by their full name.
        boolean foundEm = false;
        if(userTypedP){
            for(String key : PresidentialTerm.keySet()){
                if(presidentName.equals(key)){
                    System.out.println(presidentName + " served as the President of the United States from: " + PresidentialTerm.get(key));
                    foundEm = true;
                }
            }
            //Error handling for if the user input is not an existing President's name.
            if(foundEm == false){
                System.out.println("Sorry, we do not recognize that President. Please type their first and last name with proper capitalization.");
            }
        }



        //If the user tried to access the President's info by their sequence served.
        //Note: This is a very important concept with HashMaps and should be remembered.
        if(userTypedS){
            System.out.println("Unfortunately, I stored all the President's info in a HashMap. " +
                    "In HashMaps, the data is not stored in the entered order, like in ArrayLists. " +
                    "This makes HashMaps much more inconvenient as you cannot access elements " +
                    "at specific indexes.");
        }

        System.out.println();
        System.out.println("******************************************************************************************************************************");
    }
}
