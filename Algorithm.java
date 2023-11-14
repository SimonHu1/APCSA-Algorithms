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
        if(first==second) return 0;
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
    public static int sumOfDigits(int number)
    {
        int sum = 0;
        while(number!=0)
        {
            sum += number%10;
            number -= number%10;
            number = number/10;
        }
        return sum;
    }
    public static int biggestPow2Before(int number)
    {
        int i = 0;
        while(Math.pow(2,i+1)<=number)
        {
            i++;
        }
        return (int)Math.pow(2,i);
    }
    public static int stringsInAnotherString(String str1,String str2)
    {
        int count = 0;
        if(str2.length()>str1.length()) return 0;
        for(int i = 0;i<(str1.length()-(str2.length()-1));i++)
        {
            if(str1.substring(i,str2.length()+i).equals(str2))
            {
                count ++;
            }
        }
        return count;
    }
}
