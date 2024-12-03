package U5T7_StaticMethods1;

public class Temperature 
{
    private double highTemp;
    private double lowTemp;
    private String scale;

    public Temperature(double highTemp, double lowTemp, String scale)
    {
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        if (scale.equals("F") || scale.equals("C"))
        {
            this.scale = scale;
        }
        else
        {
            this.scale = "F";
        }
        
    }
    
    public static double convertCtoF(double temp)
    {
        return temp * 1.8 + 32;
    }

    public static double convertFtoC(double temp)
    {
        return (temp - 32) * (5.0/9.0);
    }

    public void changetoC()
    {
        if (scale.equals("F"))
        {
            highTemp = convertFtoC(highTemp);
            lowTemp = convertFtoC(lowTemp);
            scale = "C";
        }
    }

    public void changetoF()
    {
        if (scale.equals("C"))
        {
            highTemp = convertCtoF(highTemp);
            lowTemp = convertCtoF(lowTemp);
            scale = "F";
        }
    }

    public String tempInfo()
    {
        return "High Temperature: " + highTemp + " " + scale + "\n" +  "Low Temperature: " + lowTemp + " " + scale + "\n";
    }
}
