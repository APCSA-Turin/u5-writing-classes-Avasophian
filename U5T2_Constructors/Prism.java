public class Prism 
{
    private int length;
    private int width;
    private int height;
    
    public Prism(int length, int width, int height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Prism(int length)
    {
        this.length = length;
        this.width = length;
        this.height = length;
    }

    public Prism()
    {
        this.length = (int)(Math.random() * 91) + 10;
        this.width = (int)(Math.random() * 91) + 10;
        this.height = (int)(Math.random() * 91) + 10;
    }
    public void setLength(int newLength)
    {
        length = newLength;
    }

    public void setWidth(int newWidth)
    {
        width = newWidth;
    }

    public void setHeight(int newHeight)
    {
        height = newHeight;
    }

    public String dimensions()
    {
        return "Length = " + length + "\nWidth = " + width + "\nHeight = " + height;
    }

    public int volume()
    {
        return length * width * height;
    }

    public int surfaceArea()
    {
        return (2 * (length * width) + (width * 2 + length * 2) * height);
    }
}