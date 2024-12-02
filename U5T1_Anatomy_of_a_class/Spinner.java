public class Spinner 
{
    private int sections;
    private int spinValue = 0;
    private int totalSpins = 0;
    private int sum = 0;
    
    public Spinner(int sections)
    {
        this.sections = sections;
    }

    public void spin()
    {
        spinValue = (int)(Math.random() * sections) + 1;
        totalSpins += 1;
        sum += spinValue;
    }

    public int getSpinValue()
    {
        return spinValue;
    }

    public int getSpinSum()
    {
        return sum;
    }
    
    public int getSpinCount()
    {
        return totalSpins;
    }

    public double averageSpin()
    {
        return (double)sum/(double)totalSpins;
    }
}
