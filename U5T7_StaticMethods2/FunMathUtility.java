public class FunMathUtility 
{
    private FunMathUtility(){}
    
    public static boolean isEven(int num)
    {
        if (num % 2 == 0)
        {
            return true;
        }
        return false;
    }
    
    private static boolean isWholeNumber(double num)
    {
        if (num % 1 == 0)
        {
            return true;
        }
        return false;
    }

    public static boolean isPerfectSquare(int num)
    {
        double x = Math.sqrt(num);
        if (isWholeNumber(x) == true)
        {
            return true;
        }
        return false;
    }

    public static boolean isInFibonacci(int num)
    {
        if (num == 0 || num == 1)
        {
            return true;
        }
        int temp;
        int precedingNum1 = 0;
        int i = 1;
        while (i < num)
        {
            
            if (precedingNum1 + i == num) 
            {
                return true;
            }
            temp = precedingNum1;
            precedingNum1 = i;
            i = temp + i;
        }   
        return false;
    }

    public static int nextInFibonacci(int num)
    {
        int temp;
        int precedingNum = 0;
        int i = 1;
        while (i < num)
        {
            temp = precedingNum;
            precedingNum = i;
            i = temp + i;
        }  
        return num + precedingNum;
    }

    public static int prevInFibonacci(int num)
    {
        if (isInFibonacci(num)) //A
        {
            int temp; 
            int precedingNum = 0;
            int i = 1;
            while (i < num)
            {
                temp = precedingNum;
                precedingNum = i;
                i = temp + i;
            }  
            return precedingNum;
        }
        return 0;
    }


    private static int factorial(int num) 
    // i already coded way too many things on this i'm sorry
    // credit : https://www.geeksforgeeks.org/java-program-for-factorial-of-a-number/
    {
         if (num == 0) 
            return 1; 
  
        return num * factorial(num - 1); 
    }

    private static int binomialCombination(int num, int num2)
    {       
        int x = factorial(num - num2) * factorial(num2); //A
        return factorial(num) / x; //A
    } 

    public static String expandedBinomial(int y, int exponent)
    {
        String expandedBinomial = "";
        expandedBinomial += "x^" + exponent;
        int i = exponent - 1;
        int j = 1;
        int placeholderNum = 0;
        while (i > 0)
        {
            placeholderNum = binomialCombination(exponent, j); //A
            placeholderNum *= Math.pow(y, j);
            if (i == 1)
            {
                expandedBinomial += " + " + placeholderNum + "x";
            }
            else
            {
                expandedBinomial += " + " + placeholderNum + "x^" + i;
            }
            placeholderNum = 0;
            i --;
            j ++;
        }
        expandedBinomial += " + " + (int)Math.pow(y, exponent);
        return expandedBinomial;
    }
}
