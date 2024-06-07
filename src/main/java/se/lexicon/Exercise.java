package se.lexicon;

import java.util.Scanner;
import java.util.Random;

class Test
{


    // first exercise
    public static void main(String[] args)
    {
       System.out.println("Hello World");
       System.out.println("Jonathan Araya");

       GetYear();
       PrintSum();
       GetAverage();
       GetName();
       Calculator();
       Converter();
       NumberGenerator();

    }

    //second exercise
    public static void GetYear()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        double Year = scanner.nextDouble();

        if(Year % 4 == 0)
        {
            System.out.println("This is a leap year");
        }
        else
        {
            System.out.println("This is not a leap year");
        }

    }

    // third exercise

    public static void PrintSum()

    {
        System.out.println(45 + 11);
        System.out.println("45 + 11 = 56");

        System.out.println(12 * 4);
        System.out.println("12 * 4 = 48 ");

        System.out.println(24 / 6);
        System.out.println("24 / 6 = 4");

        System.out.println(55 - 12);
        System.out.println(" 55 + 12 = 43");

    }

    // fourth exercise

    public static void GetAverage()
    {
        double average = (23 + 11 + 77) / 3.0;
        System.out.println(average + " (is the average of the sum)");
    }


    //fifth exercise
    public static void GetName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

    // 6th exercise

    public static void Calculator()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        long number1 = scanner.nextLong();
        System.out.println("Enter a second number:");
        long number2 = scanner.nextLong();

        System.out.println("The value of " + number1 + " + " + number2 + " is = " + (number1 + number2));
        System.out.println("The value of " + number1 + " * " + number2 + " is = " + (number1 * number2));
        System.out.println("The value of " + number1 + " / " + number2 + " is = " + (number1 / number2));
        System.out.println("The value of " + number1 + " - " + number2 + " is = " + (number1 - number2));
    }

    // 7th exercise

    public static void Converter()
    {
        int seconds = 86399;

        int hours = seconds * 60 ;

        System.out.println(hours);
    }

    //exercise 7

    public static void NumberGenerator()
    {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int RandomNumber =  (0 + (int) (Math.random() * 501));;


                System.out.println("Guess a number between 1 and 500");
                int GuessCount = 0;


                while (true)
                {
                    int UserInput = scanner.nextInt();
                    GuessCount++;

                    if (UserInput > RandomNumber)
                    {
                        System.out.println("Your guess was too big");
                    }

                    else if (UserInput < RandomNumber)
                    {
                        System.out.println("Your guess was too small");
                    }

                    else if (RandomNumber == UserInput)
                    {
                        System.out.println("You have guessed the right number");
                        System.out.println("Your guess count: )" + GuessCount);
                        break;
                    }


                }

    }


}