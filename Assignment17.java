import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class Assignment17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder/directory on your computer and I will list all the files and sub-folders within that directory: ");
        String userInput = sc.nextLine();

        try {

            String[] pathnames;

            File f = new File(userInput);
            pathnames = f.list();

            //Iterates through all the files in the entered directory.
            for (String pathname : pathnames) {
                System.out.println(pathname);
            }

            Scanner myReader = new Scanner(f);



            myReader.close();

            //Error handling for if the directory is not found in the user-inputted folder.
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }




    }
}

