package se.lexicon;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class CurrencyConverter


{

    public static void main(String[] args)
    {
        MenuChoices();
    }

    public static int DisplayMenu()
        {
            System.out.println("1.   Convert SEK to USD");
            System.out.println("2.   Convert USD to SEK");
            System.out.println("3    Convert SEK to EURO");
            System.out.println("4    Convert EURO to SEK");
            System.out.println("0.   Exit");

            return GetValidInput();
        }

    public static int GetValidInput() {
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        while (true)
        {
            System.out.println("Please enter your choice (0-4): ");
            try
            {
                choice = scan.nextInt();
                if (choice >= 0 && choice <= 4)
                {
                    break;
                }
                else
                {
                    System.out.println("Invalid input. Please enter a number between 0 and 4.");
                }

            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input. Please enter a number value.");
                scan.next(); // Clear the invalid input
            }
        }
        return choice;
    }

        public static int GetValue()
        {
            Scanner scan = new Scanner(System.in);
            int amount = 0;
            while (true)
            {
                System.out.println("Enter an amount to convert: ");
                try {
                    amount = scan.nextInt();
                    if (amount > 0)
                    {
                    break;
                    }
                    else
                    {
                        System.out.println("Amount must be higher than 0. Please try again.");
                    }
                }
                catch (InputMismatchException e)
                {
                    System.out.println("Invalid input. Please enter a number value.");
                    scan.next();
                }
            }
            return amount;
        }

    public static void MenuChoices()
    {

        while(true)
        {
     int choice = DisplayMenu();
     double originalAmount;
     double convertedAmount;
     String conversionType;

            switch (choice)
            {
                case 1:
                    System.out.println("Convert SEK to USD");
                    originalAmount = GetValue();
                    convertedAmount = originalAmount * 0.095;
                    conversionType = "SEK to USD";
                    DisplayResults(conversionType, originalAmount, convertedAmount);
                    break;
                case 2:
                    System.out.println("Convert USD to SEK");
                    originalAmount = GetValue();
                    convertedAmount = originalAmount / 0.095;
                    conversionType = "USD to SEK";
                    DisplayResults(conversionType, originalAmount, convertedAmount);
                    break;
                case 3:
                    System.out.println("Convert SEK to EURO");
                    originalAmount = GetValue();
                    convertedAmount = originalAmount * 0.089;
                    conversionType = "SEK to EURO";
                    DisplayResults(conversionType, originalAmount, convertedAmount);
                    break;
                case 4:
                    System.out.println("Convert EURO to SEK");
                    originalAmount = GetValue();
                    convertedAmount = originalAmount / 0.089;
                    conversionType = "EURO to SEK";
                    DisplayResults(conversionType, originalAmount, convertedAmount);
                    break;
                case 0:
                    System.out.println("Exiting program. Have a nice day!");
                    return;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }

        }
    }

    public static void DisplayResults(String conversionType, double originalAmount, double  convertedAmount)
    {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedOriginalAmount = currencyFormat.format(originalAmount);
        String formattedConvertedAmount = currencyFormat.format(convertedAmount);
        String formattedDateTime = currentDateTime.format(dateTimeFormatter);

        System.out.println("Conversion Type: " + conversionType);
        System.out.println("Original Amount: " + formattedOriginalAmount);
        System.out.println("Converted Amount: " + formattedConvertedAmount);
        System.out.println("Conversion Date and Time: " + formattedDateTime);
        System.out.println();
    }

}
