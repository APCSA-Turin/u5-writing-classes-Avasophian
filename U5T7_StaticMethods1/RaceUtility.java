package U5T7_StaticMethods1;

public class RaceUtility 
{

    public RaceUtility(){}
    
    public static double milesToKm(double miles)
    {
        return miles * 1.6093;
    }

    public static double kmToMiles(double km)
    {
        return km * 0.62137;
    }

    public static String makeProper(String string)
    {
        int i = 1;
        String newString = "";
        newString += string.substring(0, 1).toUpperCase();
        while (i < string.length())
        {
            if (string.substring(i - 1, i).equals(" "))
            {
                newString += string.substring(i, i +1).toUpperCase();
            }
            else
            {
                newString += string.substring(i, i +1).toLowerCase();
            }
            i ++;
        }
        return newString;
    }
}
