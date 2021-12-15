import java.util.Scanner;
import java.util.Arrays;

public class Assignment13{
    public static void main(String[] args){
        System.out.println("********************************************************************");
        System.out.println();
        String[][] nameGender = {
                {"Amy", "F"},
                {"Ryan", "M"},
                {"Katy", "F"},
                {"Phillip", "M"},
                {"Sally", "F"},
                {"Max", "M"}
        };
        System.out.print("Here are all the students and their respective genders of this group: ");
        //Iterates through the 2D array
        for(int i = 0; i < nameGender.length; i++){
            System.out.println();
            for(int j = 0; j < nameGender[0].length; j++){
                System.out.print(nameGender[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("What gender would you like to display? (Type M for Male or F for Female) ");
        String userInput = sc.nextLine();

        while(!userInput.equals("M") && !userInput.equals("F")){
            System.out.println("Sorry, we do not recognize that input. Please enter M for Male or F for Female ");
            userInput = sc.nextLine();
        }

        if(userInput.equals("M")){
            System.out.print("All of the male students in this group are: ");
        }
        else{
            System.out.print("All of the female students in this group are: ");
        }

        for(int i = 0; i < nameGender.length; i++){
            for(int j = 0; j < 1; j++){
                if(nameGender[i][1].equals(userInput)){
                    System.out.print(nameGender[i][0] + " ");
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("********************************************************************");
    }
}
