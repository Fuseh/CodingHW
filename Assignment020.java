import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class Assignment20{
    public static void main(String[] args){
        System.out.println("******************************************************************************************************************************");

        DecimalFormat df1 = new DecimalFormat( "#.###" );

        System.out.println("Welcome to the question solver. We automatically solve simple, simultaneous and quadratic equations for you.");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the equation to be solved: ");
        String userInput = sc.nextLine();

        boolean containsX = false;
        boolean containsY = false;
        boolean containsX2 = false;
        if (userInput.contains("x")){
            containsX = true;
        }
        if (userInput.contains("y")){
            containsY = true;
        }
        if (userInput.contains("x^2")){
            containsX2 = true;
        }


        //For single-variable questions
        boolean incompleteEquation = false;
        if (containsX && !containsY && !containsX2){
            //Error handling for incomplete equations.
            if (!userInput.contains("=")){
                System.out.println("This is not a complete equation! Please include an equals operator...");
                incompleteEquation = true;
                System.exit(0);
            }
            //Creating a left and right side of the equals operator.
            if (incompleteEquation == false){
                String[] sides = userInput.split("=");
                String leftSide = sides[0];
                String rightSide = sides[1];

                int right = Integer.parseInt(rightSide.trim());
                leftSide = leftSide.trim();

                int indexAtX = leftSide.indexOf("x");
                double Coefficient = 0.0;

                //For equations with "-N" in the equation "Mx - N = C".
                String replace = leftSide.substring(indexAtX + 1, leftSide.length());
                if (replace.contains("-")){
                    //CODERS NOTE: "replaceAll is a WEIRD method and has to have a function to the program in the SAME line it is used in...
                    String rightOfX = replace.replaceAll("-", "+");
                    int numRightOfX = Integer.parseInt(rightOfX.replaceAll(" ", ""));

                    //Moving "+N" to the right side of the equation.
                    int updatedAns = right + numRightOfX;

                    //if there is NOT a space next to x, move that NUM to div other side/
                    if (leftSide.indexOf("x") != 0) {
                        Coefficient = Integer.parseInt(leftSide.substring(0, indexAtX));
                    } else {
                        Coefficient = 1;
                    }

                    System.out.println("x = " + updatedAns / Coefficient);
                }

                //For equations with "+N" in the equation "Mx + N = C".
                if (replace.contains("+")){
                    //CODERS NOTE: “*”, “+”, “?”, are metacharacters so in order to reference them, use an escape call.
                    String rightOfX = replace.replaceAll("\\+", "-");
                    int numRightOfX = Integer.parseInt(rightOfX.replaceAll(" ", ""));
                    double updatedAns = right + numRightOfX;

                    if (leftSide.indexOf("x") != 0) {
                        Coefficient = Integer.parseInt(leftSide.substring(0, indexAtX));
                    } else {
                        Coefficient = 1;
                    }

                    System.out.println("x = " + updatedAns / Coefficient);
                }

            }


        }


        //For quadratic questions
        if (containsX && containsX2) {
            //Error handling
            if (!userInput.contains("=")){
                System.out.println("This is not a complete equation! Please include an equals operator...");
                incompleteEquation = true;
                System.exit(0);
            }
            if (incompleteEquation == false){
                String[] sides = userInput.split("=");
                String leftSide = sides[0];
                String rightSide = sides[1];

                boolean containsNeg = false;
                boolean containsPos = false;
                if(rightSide.contains("-")){
                    containsNeg = true;
                }
                else{
                    containsPos = true;
                }

                int right = Integer.parseInt(rightSide.trim());
                leftSide = leftSide.trim();


                //First value ("A")
                int indexAtX2 = leftSide.indexOf("x");
                boolean aExists = true;
                int A = 0;
                if(indexAtX2 == 0){
                    A = 1;
                    aExists = false;
                }
                else{
                    A = Integer.parseInt(leftSide.substring(0, indexAtX2));
                }


                //Second value ("B")
                int indexAtX = leftSide.indexOf("x", indexAtX2 + 1);
                String rightOfX2 = leftSide.substring(indexAtX2 + 3, indexAtX);
                String trimDis = rightOfX2.replaceAll(" ", "");

                int B = Integer.parseInt(trimDis.trim());

                //Third value ("C")
                String rightOfX = leftSide.substring(indexAtX + 1, leftSide.length());
                String trimDisToo = rightOfX.replaceAll(" ", "");

                int C = Integer.parseInt(trimDisToo.trim());

                if(right != 0){
                    //For negative values on the rightSide.
                    if(containsNeg){
                        C = C - right;
                    }
                    if(containsPos){
                        C = C - right;
                    }
                }

                System.out.println();
                System.out.println("These are the A, B and C values you entered: ");
                System.out.println("A: " + A);
                System.out.println("B: " + B);
                System.out.println("C: " + C);


                System.out.println();
                if((Math.pow(B, 2) - 4*A*C) < 0){
                    System.out.println("This equation does not have any zeros.");
                }
                else{
                    //Mathy stuff (Quadratic Formula)
                    double positiveAns = ((-B + Math.sqrt(Math.pow(B, 2) - 4*A*C)) / (2 * A));
                    double negativeAns = ((-B - Math.sqrt(Math.pow(B, 2) - 4*A*C)) / (2 * A));

                    df1.format(positiveAns);
                    df1.format(negativeAns);
                    System.out.println("x = " + positiveAns + " and " + negativeAns);
                }


            }

        }


        //For two-variable questions
        if (containsX && containsY) {
            //Error handling
            if (!userInput.contains("=")){
                System.out.println("This is not a complete equation! Please include an equals operator...");
                incompleteEquation = true;
                System.exit(0);
            }
            System.out.println("Enter the second equation in your simultaneous problem");
            String secondEq = sc.nextLine();
            if (!secondEq.contains("=")){
                System.out.println("This is not a complete equation! Please include an equals operator...");
                incompleteEquation = true;
                System.exit(0);
            }

            if(incompleteEquation == false){
                String[] sides = userInput.split("=");
                String leftSide = sides[0];
                String rightSide = sides[1];

                String[] sides2 = secondEq.split("=");
                String leftSide2 = sides2[0];
                String rightSide2 = sides2[1];

                leftSide = leftSide.trim();


                int indexAtX = leftSide.indexOf("x");
                int indexAtY = leftSide.indexOf("y");
                int Coefficient = 0;
                if(indexAtX == 0){
                    Coefficient = 1;
                }
                else{
                    Coefficient = Integer.parseInt(leftSide.substring(0, indexAtX));
                }

                String leftOfX = leftSide.substring(indexAtX + 1, indexAtY + 1);
                leftOfX = leftOfX.replaceAll(" ", "");

                String noY = leftSide.substring(indexAtX + 1, indexAtY);
                noY = noY.replaceAll(" ", "");

                double originalValue = Integer.parseInt(noY);

                if(noY.contains("-")){
                    noY = noY.replaceAll("-", "+");
                }

                if(noY.contains("+")){
                    noY = noY.replaceAll("\\+", "-");
                }


                int rightConstant = Integer.parseInt(rightSide.trim());
                int leftOfXNoY = Integer.parseInt(noY);

                //Divide the numbers on the right side by the coefficient of X.
                int constantDiv = rightConstant / Coefficient;
                int yDiv = leftOfXNoY / Coefficient;

                String sConstantDiv = String.valueOf(constantDiv);
                String sYDiv = String.valueOf(yDiv);


                String newRight = sConstantDiv + sYDiv + "y";
                System.out.println("We get x = " + newRight + " from the first equation. We then plug it into the second equation...(calculating)");


                //Now working with the second equation.
                leftSide2 = leftSide2.trim();

                int indexAtX2 = leftSide2.indexOf("x");

                int Coefficient2 = 0;
                if(indexAtX2 == 0){
                    Coefficient2 = 1;
                }
                else{
                    Coefficient2 = Integer.parseInt(leftSide2.substring(0, indexAtX2));
                }
                //1st Math Step: Substitute x from eq1 into x in eq2.
                int finalRight = constantDiv + yDiv;
                int mathStepOne = Coefficient2 * finalRight;


                //2nd Math Step: Combine like variables (in this case, the y's).
                leftSide2 = leftSide2.replaceAll(" ", "");
                int indexAtY2 = leftSide2.indexOf("y");

                String sussy = leftSide2.substring(indexAtX + 1, indexAtY2);
                boolean hasNeg = false;
                boolean hasPos = false;
                if(sussy.contains("-")){
                    hasNeg = true;
                }
                else{
                    hasPos = true;
                }

                int leftOfY2 = Integer.parseInt(sussy);
                int mathStepTwo = mathStepOne + leftOfY2;

                //3rd Math Step: Divide num on right by answer from 2nd math step in order to isolate y and calculate its value.
                int right2 = Integer.parseInt(rightSide2.trim());
                int finalY = right2 / mathStepTwo;
                System.out.println();
                if(hasNeg == true){
                    System.out.println("The second equation then comes out to be: " + Coefficient2 + "x " + leftOfY2 + " y" + " = " + right2);

                }
                if(hasPos == true){
                    System.out.println("The second equation then comes out to be: " + Coefficient2 + "x + " + leftOfY2 + "y" + " = " + right2);

                }
                System.out.println("From this, we get y = " + finalY + ". Now, we must plug it back into the first equation to get x... (calculating)");
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");
                System.out.println(".");


                double mathStepFour = originalValue * finalY;


                System.out.println(mathStepFour);
                double mathStepFive = rightConstant - mathStepFour;
                System.out.println(mathStepFive);

                double finalX = mathStepFive / Coefficient;
                System.out.println(finalX);

            }


        }

        System.out.println();
        System.out.println("******************************************************************************************************************************");

    }
}
