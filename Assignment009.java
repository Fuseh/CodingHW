import java.util.ArrayList;
import java.util.Scanner;

public class Assignment9{
    public static void main(String[] args){
        System.out.println("********************************************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of all your friends one by one. Once you are done, enter exit.");

        boolean listingFriends = true;
        ArrayList<String> Friends = new ArrayList<>();
        String userInput = sc.nextLine();
        if(userInput.equals("exit")){
            sc.close();
            listingFriends = false;
        }
        else{
            Friends.add(userInput);
        }


        while(listingFriends){
            System.out.println("Enter another friend's name or type 'exit' if you have do not have anymore friends: ");
            userInput = sc.nextLine();
            Friends.add(userInput);
            if(userInput.equals("exit")){
                sc.close();
                listingFriends = false;
            }
            else{
                continue;
            }
        }

        Friends.remove("exit");
        System.out.println("The names of all your friend(s) are: " + Friends);
        System.out.println();

        if(Friends.size() > 5){
            System.out.println("Wow! " + Friends.size() + " friends is a crap ton! I wish I could have as many friends as you... ");
        }
        else if(Friends.size() == 1){
            System.out.println("Nice! You have a best friend.");
        }
        else if(Friends.size() == 0){
            System.out.println("Damn, you are one lonely person. I can be your friend, pal!");
        }
        else{
            System.out.println(Friends.size() + " friends seems like a nice and small friend group! Good for you pal.");
        }

        System.out.println();
        System.out.println("********************************************************************");
    }
}
