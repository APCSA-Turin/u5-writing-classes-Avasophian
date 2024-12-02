public class AdditionPattern
{
    // type up the complete AdditionPattern class here.

        private int num;
        private int pattern;
        private int originalNum;

        public AdditionPattern(int num, int pattern)
        {
        this.num = num;
        this.pattern = pattern;
        originalNum = num;

        }

        public void next()
        {
        num += pattern;
        }

        public void prev()
        {
        if (num != originalNum)
        {
            num -= pattern;
        }
        }

        public int currentNumber()
        {
        return num;
        }







}