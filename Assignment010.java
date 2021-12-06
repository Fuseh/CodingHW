import java.util.Scanner;
import java.util.ArrayList;

public class Assignment10{
        public static void main(String[] args){
            System.out.println("**********************************************************************************************************************");

            ArrayList<String> studentName = new ArrayList<>();
            ArrayList<Integer> studentGrade = new ArrayList<>();
            ArrayList<Double> studentGPA = new ArrayList<>();
            System.out.println("Welcome to the BU Student Inventory System");
            boolean inputted = true;

            while(inputted){
                System.out.println("Type one of the menu options: 1. Add a student  2. Remove a Student  3. Change Student Details 4. Statistics 5. Exit ");
                Scanner sc = new Scanner(System.in);
                Integer userInput = sc.nextInt();
                if(userInput == 5){
                    sc.close();
                    System.out.println("You have successfully exited the student maintenance system. Have a great day!");
                    inputted = false;

                }
                else if(userInput == 4){
                    reportStats(studentName, studentGrade, studentGPA);
                    System.out.println();
                }
                else if(userInput == 3){
                    changeDetails(studentName, studentGrade, studentGPA);
                    System.out.println();
                }
                else if(userInput == 2){
                    removeStudent(studentName, studentGrade, studentGPA);
                    System.out.println();
                }
                else if(userInput == 1){
                    addStudent(studentName, studentGrade, studentGPA);
                    System.out.println("Successfully added student to the system. Thank you!");
                    System.out.println();
                }
                else{
                    System.out.println("Invalid Option Chosen");
                }
            }


        }
        //Adds a student to the existing student system when given the name.
        public static String addStudent(ArrayList<String> studentName, ArrayList<Integer> studentGrade, ArrayList<Double> studentGPA){
            Scanner addStudent = new Scanner(System.in);
            System.out.println("Adding new student. Please enter student's full name:");

            String Student = addStudent.nextLine();
            studentName.add(Student);

            System.out.println("Please enter student's grade (between 9 to 12):");
            Integer Grade = addStudent.nextInt();
            if(Grade >= 9 && Grade <= 12){
                studentGrade.add(Grade);
            }
            else{
                Grade = 9;
                studentGrade.add(Grade);
            }

            System.out.println("Please enter the student's GPA (between 0 and 5.0):");
            Double GPA = addStudent.nextDouble();
            if(GPA >= 0.0 && GPA <= 5.0){
                studentGPA.add(GPA);
            }
            else{
                GPA = 3.5;
                studentGPA.add(GPA);
            }

            return "Success";
        }
        //Removes a student from the existing student system when given the name.
        public static String removeStudent(ArrayList<String> studentName, ArrayList<Integer> studentGrade, ArrayList<Double> studentGPA){
            Scanner removeStudent = new Scanner(System.in);
            System.out.println("Please enter the name of the student to be removed from BU:");

            String Remove = removeStudent.nextLine();
            boolean studentRemoved = false;
            for(int i = 0; i < studentName.size() - 1; i++){
                if(Remove.equals(studentName.get(i))){
                    studentName.remove(i);
                    studentGrade.remove(i);
                    studentGPA.remove(i);
                    System.out.println("Student successfully removed BU. We wish them the best!");
                    studentRemoved = true;
                    break;
                }
            }
            if(studentRemoved == false){
                System.out.println("Student NOT removed. The name you entered is not enrolled in BU at this point.");
            }

            return "Success";
        }
        //Updates only the GPA and Grade of an existing student.
        public static String changeDetails(ArrayList<String> studentName, ArrayList<Integer> studentGrade, ArrayList<Double> studentGPA){
            Scanner changeDetails = new Scanner(System.in);
            System.out.println("Please enter the name of the student to be updated at BU:");

            String updatedInfo = changeDetails.nextLine();
            boolean studentUpdated = false;
            for(int i = 0; i < studentName.size(); i++){
                if(updatedInfo.equals(studentName.get(i))){
                    System.out.println("Please enter student's grade to change (between 9th and 12th grade):");
                    Integer newGrade = changeDetails.nextInt();
                    studentGrade.remove(i);
                    studentGrade.add(i, newGrade);
                    System.out.println("Please enter the updated GPA of this student:");
                    Double newGPA = changeDetails.nextDouble();
                    studentGPA.remove(i);
                    studentGPA.add(i, newGPA);
                    studentUpdated = true;
                    break;
                }
            }
            if(studentUpdated == false){
                System.out.println("Student not found. The name you entered does not belong to a student who is currently enrolled in BU at this point.");
            }

            return "Success";
        }
        //Returns key statistics about the student body.
        public static String reportStats(ArrayList<String> studentName, ArrayList<Integer> studentGrade, ArrayList<Double> studentGPA){
            System.out.println("Here are the details of the students of BU!");
            System.out.println();
            ArrayList<String> highGPA = new ArrayList<>();
            boolean numOfHighGPA = false;
            boolean printed = false;
            Double total = 0.0;
            for(int i = 0; i < studentName.size(); i++){
                if(studentGPA.get(i) >= 4.0){
                    if(printed == false){
                        System.out.print("These are the students who are performing well in school: ");
                        printed = true;
                    }
                        System.out.print(studentName.get(i) + " ");
                        highGPA.add(studentName.get(i));
                        numOfHighGPA = true;

                }
                total += studentGPA.get(i);
            }
            if(numOfHighGPA == false){
                System.out.println("Unfortunately, there are no students with a high GPA at this time at BU.");
            }
            System.out.println();
            System.out.println("Total number of students currently enrolled at BU is: " + studentGrade.size());
            if(studentGPA.size() > 0){
                Double average = total / studentGPA.size();
                System.out.println("The average GPA of all BU students is: " + average);
            }
            else{
                System.out.println("The average GPA of all BU students is: 0");
            }

            System.out.println("The total number of students with a GPA of 4.0 or better is: " + highGPA.size());
            return "success";
    }
}
