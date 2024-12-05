public class FunMath 
{
    private int userNum;
    private int userExponent;
    public FunMath(int userNum, int userExponent)
    {
        this.userNum = userNum;
        this.userExponent = userExponent;
    }

    public void binomialExpanding()
    {
        System.out.println("Your binomial: (x" + " + " + userNum + ")" + "^" + userExponent);
        System.out.println("Your expanded binomial: " + FunMathUtility.expandedBinomial(userNum, userExponent)); //E
    }

    public void evenSquare()
    {

        if (FunMathUtility.isEven(userNum) && FunMathUtility.isPerfectSquare(userNum)) //B //E
        {
            System.out.println(userNum + " is even and a perfect square!");
        }
        else if (FunMathUtility.isEven(userNum)) //B //E
        {
            System.out.println(userNum + " is even but isn't a perfect square.");
        }
        else if (FunMathUtility.isPerfectSquare(userNum)) //B //E
        {
            System.out.println(userNum + " is a perfect square but isn't even.");
        }
        else
        {
            System.out.println(userNum + " is not a perfect square or even.");
        }
    }
    
    private static int fibonacciNext(int fibonacciNumber, int howFarAhead)
    {
        for (int i = 1; i <= howFarAhead; i++)
        {
            fibonacciNumber = FunMathUtility.nextInFibonacci(fibonacciNumber); //E
        }
        return fibonacciNumber;
    }

    private static int fibonacciPrev(int fibonacciNumber, int howFarBehind)
    {
        for (int i = 1; i <= howFarBehind; i++)
        {
            if (fibonacciNumber > 0)
            {
                fibonacciNumber = FunMathUtility.prevInFibonacci(fibonacciNumber); //E
            }
        }
        return fibonacciNumber;
    }

    public static void fibonacciFun(int fibonacciNumber)
    {

        System.out.println("Your number is " + fibonacciNumber);
        if (FunMathUtility.isInFibonacci(fibonacciNumber)) //E
        {
            System.out.println(fibonacciNumber + " is in the Fibonacci sequence!");
            System.out.println("The previous 5 numbers in the Fibonacci sequence: " + fibonacciPrev(fibonacciNumber, 1) 
            + ", " + fibonacciPrev(fibonacciNumber, 2)  + ", " + fibonacciPrev(fibonacciNumber, 3)
             + ", " + fibonacciPrev(fibonacciNumber, 4) + ", " + fibonacciPrev(fibonacciNumber, 5)); //D
            System.out.println("The next 5 numbers in the Fibonacci sequence: " + fibonacciNext(fibonacciNumber, 1) + 
            ", " + fibonacciNext(fibonacciNumber, 2)  + ", " + fibonacciNext(fibonacciNumber, 3) 
            + ", " + fibonacciNext(fibonacciNumber, 4) + ", " + fibonacciNext(fibonacciNumber, 5)); //D
        }
       else
       {
        System.out.println(fibonacciNumber + " is not in the Fibonacci sequence..."); 
       }
    }

    public boolean isPrime()
    {
        for (int i = 2; i < userNum; i++)
        {
            if (userNum % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public String factsAboutUserNum()
    {
        String infoString =  "";
        if (FunMathUtility.isEven(userNum)) //E
        {
            infoString += userNum + " is even\n";
        }
        else
        {
            infoString += userNum + " is odd\n";
        }
        if (FunMathUtility.isPerfectSquare(userNum)) //E
        {
            infoString += userNum + " is a perfect square\n";
        }
        else
        {
            infoString += userNum + " is not a perfect square\n";
        }
        if (FunMathUtility.isInFibonacci(userNum)) //E
        {
            infoString += userNum + " is in the Fibonacci sequence\n";
        }
        else
        {
            infoString += userNum + " is not in the Fibonacci sequence\n";
        }
        if (isPrime()) //C
        {
            infoString += userNum + " is a prime number\n";
        }
        else
        {
            infoString += userNum + " is a composite number\n";
        }
        return infoString;
    }

    public void setUserNum(int newNum)
    {
        userNum = newNum;
    }

    public void setExponent(int newNum)
    {
        userExponent = newNum;
    }
}
