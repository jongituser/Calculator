package se.lexicon;

import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            long result = 0;
            long x = 0;
            long y = 0;

            System.out.println("Choose your first number:");
            while(!scan.hasNextLong())
            {
                System.out.println("That's not a number!");
                scan.next();
            }
            x = scan.nextLong();

            System.out.println("Choose your second number:");
            while(!scan.hasNextLong())
            {
                System.out.println("That's not a number!");
                scan.next();
            }
            y = scan.nextLong();

            System.out.println("Choose your operator (+, -, *, /):");

            char operator = scan.next().charAt(0);

                switch (operator) {
                    case '*':
                        result = x * y;
                        break;
                    case '/':
                        result = x / y;
                        break;
                    case '+':
                        result = x + y;
                        break;
                    case '-':
                        result = x - y;
                        break;
                    default:
                        System.out.println("Invalid operator");
                        continue;

            }

            System.out.println("Your result is : " + result);

            System.out.println("Do you want to continue with another calculation? (yes/no):");
            String continueInput = scan.next();

            while (!continueInput.equalsIgnoreCase("yes") && !continueInput.equalsIgnoreCase("no")
             && !continueInput.trim().isEmpty())
            {
                System.out.println("Invalid input. Please enter 'yes' or 'no':");
                continueInput = scan.next();
            }

            if (continueInput.equalsIgnoreCase("yes"))
            {

            }
            else
            {
                break;
            }
        }

        System.out.println("Thank you for using our calculator and have a nice day");
    }
}