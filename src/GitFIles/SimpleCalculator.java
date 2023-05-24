package GitFIles;

import java.util.Scanner;

public class SimpleCalculator implements Operators {


    Scanner sc = new Scanner(System.in);
    private int num1;
    private int num2;

    void getNumber() {
        System.out.println("Welcome to JoeTechulator");
        System.out.print("Enter num1:");
        num1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter num2:");
        num2 = sc.nextInt();

    }

    void DisplayValue() {
        System.out.println("values Entered are:");
        System.out.println(num1 + "\n" + num2);
    }

    void calculate() {
        System.out.println();
    }

    @Override
    public void add() {
        System.out.println("Answer is : "+ (num1 + num2));
    }

    @Override
    public void sub() {
        System.out.println("Answer is: "+(num1-num2));
    }

    @Override
    public void multiply() {
        System.out.println("Answer is : "+(num1 * num2));
    }

    @Override
    public void division() {
        System.out.println("Answer is : "+(num1 / num2));
    }

    void inputs() {
        System.out.println("Enter one of the following operations:");
        char[] operators = {'+', '-', '/', '*'};
        int count = 0;
        for (int i = 0; i < operators.length; i++) {
            count++;
            System.out.println(count + ") " + operators[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleCalculator cal = new SimpleCalculator();
        cal.getNumber();
        cal.inputs();


        int options = sc.nextInt();
        switch (options) {
            case 1:
                cal.add();
                break;
            case 2:
                cal.sub();
                break;
            case 3:
                cal.multiply();
                break;
            case 4:
                cal.division();
                break;
            default:
                System.out.println("not part of the opertations");


        }

    }

}
