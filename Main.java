public class Main
{
    public static void main(String[]args)
    {
        System.out.println(Algorithm.isDivisible(9,3));
        System.out.println(Algorithm.isDivisible(100,100));
        System.out.println(Algorithm.isDivisible(1,2));

        System.out.println(Algorithm.sumOfOddsBetween(4,9));
        System.out.println(Algorithm.sumOfOddsBetween(10,10));
        System.out.println(Algorithm.sumOfOddsBetween(99,101));

        System.out.println(Algorithm.multiplesOfTenBetween(10,99));
        System.out.println(Algorithm.multiplesOfTenBetween(98,99));
        System.out.println(Algorithm.multiplesOfTenBetween(6,32));

        System.out.println(Algorithm.sumOfDigits(321));
        System.out.println(Algorithm.sumOfDigits(10));
        System.out.println(Algorithm.sumOfDigits(101230));

        System.out.println(Algorithm.biggestPow2Before(800));
        System.out.println(Algorithm.biggestPow2Before(2000));
        System.out.println(Algorithm.biggestPow2Before(16));

        System.out.println(Algorithm.stringsInAnotherString("Mississippi", "si"));
        System.out.println(Algorithm.stringsInAnotherString("qqqqq", "q"));
        System.out.println(Algorithm.stringsInAnotherString("qq", "qqq"));
    }
}
