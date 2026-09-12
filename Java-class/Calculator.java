import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double num1,num2;
        char op;

        System.out.println("Enter num1: ");
        num1= sc.nextDouble();

        System.out.println("Enter operator: ");
        op= sc.next().charAt(0);

        System.out.println("Enter num2: ");
        num2= sc.nextDouble();

        if (op== '+') {
            System.out.println("Result: " + (num1+num2));
        }
        else if (op== '-') {
            System.out.println("Result: " + (num1-num2));
        }
        else if (op== '*') {
            System.out.println("Result: " + (num1*num2));
        }
        else if (op== '/') {
            if(num2==0) {
                System.out.println("Error:Division by 0 is not possible!");
            }
            else{
                System.out.println("Result: " + (num1/num2));
            } 
        }
        else {
            System.out.println(" Invalid Operator!" );
        }
        sc.close();
    }
}