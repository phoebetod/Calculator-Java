import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your first number?");
        int num1 = userInput.nextInt();

        System.out.println("What is your second number?");
        int num2 = userInput.nextInt();

        System.out.println("What calculation would you like to perform, +, -, * or / ?");
        userInput.nextLine();
        String symbol = userInput.nextLine();

        int answer = 0;

        switch (symbol) {
            case ("+"):
                answer = num1 + num2;
                break;

            case ("-"):
                answer = num1 - num2;
                break;

            case ("*"):
                answer = num1 * num2;
                break;

            case ("/"):
                answer = num1 / num2;
                break;

            default:
                System.out.println("There has been an error, please try again.");
                break;
        }
        System.out.println(answer);

    }
}
