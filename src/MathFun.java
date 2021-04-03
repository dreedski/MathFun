import java.util.Scanner;

public class MathFun {


    public static int add(int x, int y){
        return x + y;
    }


    public static int subtract(int x, int y){
        return x - y;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int operation, userNum1, userNum2, result;

        System.out.println("Would you like to add (press 1) or subtract (press 2): ");
        operation = in.nextInt();

        if (operation == 1){
            System.out.println("Enter the first number to add: ");
            userNum1 = in.nextInt();
            System.out.println("Enter the second number to add: ");
            userNum2 = in.nextInt();
            result = add(userNum1, userNum2);
            System.out.println("Your result is: " + result);
        }else if(operation == 2){
            System.out.println("Enter the first number: ");
            userNum1 = in.nextInt();
            System.out.println("Enter the second number: ");
            userNum2 = in.nextInt();
            result = subtract(userNum1, userNum2);
            System.out.println("Your result is: " + result);
        }

    }
}
