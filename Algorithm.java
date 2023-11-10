public class Algorithm
{
    public static int numberLength(int number)
    {
        String num = number+"";
        return num.length();
    }
    public static boolean isDivisible(int first, int second)
    {
        return first%second == 0;
    }
    public static int sumOfOddsBetween(int first, int second)
    {
        int sum = 0;
        while(first<=second)
        {
            if(first%2==0)
            {
                first++;
            }
            sum += first;
            first += 2;
        }
        return sum;
    }
    public static int multiplesOfTenBetween(int first, int second)
    {
        int sum = 0;
        second -= second%10;
        while (first<=second)
        {
            if(first%10!=0)
            {
                first += 10-first%10;
            }
            sum += first;
            first += 10;
        }
        return sum;
    }
}
