import java.util.Scanner;

public class App{
    static final Scanner inputScanner = new Scanner(System.in);
    // ...
    
    private static String getString(String prompt) {
        System.out.println(prompt);
        String stringOne = inputScanner.nextLine();
        //System.out.println(stringOne);
        return stringOne;

    }
    
    private static double getDouble(String prompt) {
        System.out.println(prompt);
        double doubleOne = inputScanner.nextDouble();
        //System.out.println(doubleOne);
        return doubleOne;

       
    }

    
    




    public static void main(String[] args){

        double num1 = getDouble("Please enter a number: ");
        System.out.println("You entered: " + num1);
        double num2 = getDouble("Please enter a number: ");
        System.out.println("You entered: " + num2);

       
        new Calculator();
        double addResult = Calculator.add(num1,num2);
        double subtractResult = Calculator.subtract(num1, num2);
        double mulitplyResult = Calculator.multiply(num1, num2);
        double divideResult = Calculator.divide(num1, num2);
       
        System.out.println("Added = " + addResult);
        System.out.println("Subtracted = " + subtractResult);
        System.out.println("Multiplied = " + mulitplyResult);
        System.out.println("Divided = " + divideResult);

        String goAgain = getString("Go again? y/n:");
        
        
        
        


       

       


    
    }



}