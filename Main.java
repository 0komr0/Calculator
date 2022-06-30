package calculatorSimple;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        Scanner myObj = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean isOn = true;
        do {
            System.out.println("***************Hi, welcome to the simple calculator!********************");
            System.out.println("***Choose the mathematical operations from 1 to 4 or leave the program**");
            System.out.println("1. add two digits");
            System.out.println("2.substract two digits");
            System.out.println("3.multiply two digits");
            System.out.println("4.divide two digits");
            System.out.println("5.leave");
            String userChoice = myObj.next();
            if (Operation.checkIfOperationExist(userChoice)) {
                if (Operation.getEnum(userChoice).equals(Operation.LEAVE)) {
                    System.out.println("See ya later!");
                    Thread.sleep(5000);
                    isOn = false;
                } else {
                    System.out.println("Input two digits: ");
                    int a = myObj.nextInt();
                    int b = myObj.nextInt();
                    calculator.calculate(a, b, Operation.getEnum(userChoice));
                }

            } else {
                System.out.println("Operation is not correct, pls type correct");
            }
        } while (isOn);
    }

}
