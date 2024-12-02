public class Dice
{
    private int sides;
    private int rollCount = 0;
    private int rollValue = 0;

    public Dice(int sides)
    {
        this.sides = sides;
    }

    public void roll()
    {
        rollCount += 1;
        rollValue = (int)(Math.random() * sides) + 1;
    }

    public void setSides(int newSides)
    {
        sides = newSides;
    }

    public int getSides()
    {
        return sides;
    }

    public int getRollCount()
    {
        return rollCount;
    }

    public int getRollValue()
    {
        return rollValue;
    }
}