import java.util.Scanner;
public class MathRunner 
{
    private MathRunner(){}
    public static void start()
    {
        Scanner scan = new Scanner(System.in);
        int userChoice = 0;
        int changeNum = 0;
        String x;
        System.out.print("Enter a main number: ");
        int num1 = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter a exponent: ");
        int num2 = scan.nextInt();
        FunMath userMath = new FunMath(num1, num2);
        scan.nextLine();
        while (true)
        {
            System.out.println();
            System.out.println("1. Print info of main number\n2. Change value of main number\n3. Change value of exponent\n4. Check if main number is an even, perfect square\n5. Binomially expand (with main number as y and exponent as n)\n6. Do some cool things with Fibonacci sequence (the number you choose has to be in the Fibonacci sequence)\n7. Quit");
            userChoice = scan.nextInt();
            scan.nextLine();
            System.out.println("--------------------------------------");
            if (userChoice == 1)
            {
                x = userMath.factsAboutUserNum();
                System.out.println(x);
            }
            else if (userChoice == 2)
            {
                System.out.print("What number do you wanna change your main number to?: ");
                changeNum = scan.nextInt();
                scan.nextLine();
                userMath.setUserNum(changeNum);
                changeNum = 0;
            }
            else if (userChoice == 3)
            {
                System.out.print("What number do you wanna change your exponent number to?: ");
                changeNum = scan.nextInt();
                scan.nextLine();
                userMath.setExponent(changeNum);
                changeNum = 0;
            }
            else if (userChoice == 4)
            {
                userMath.evenSquare();
            }
            else if (userChoice == 5)
            {
                userMath.binomialExpanding();
            }
            else if (userChoice == 6)
            {
                System.out.print("What number do you choose? It has to be in the Fibonacci sequence: ");
                changeNum = scan.nextInt();
                scan.nextLine();
                FunMath.fibonacciFun(changeNum);
                changeNum = 0;
            }
            else if (userChoice == 7)
            {
                break;
            }
            System.out.println("--------------------------------------");
        }
    }
} 
