public class Main
{
    public static void main(String[]args)
    {
        System.out.println(Algorithm.stringContainsOther("Hello World", "World"));
        System.out.println(Algorithm.stringContainsOther("Hello","hello"));
        System.out.println(Algorithm.stringContainsOther("super","superpower"));

        System.out.println(Algorithm.reversedString("gohangasalami"));
        System.out.println(Algorithm.reversedString("superpower"));
        System.out.println(Algorithm.reversedString("123456789"));

        System.out.println(Algorithm.isPalindrome("amanaplanacanalpanama"));
        System.out.println(Algorithm.isPalindrome("racecar"));
        System.out.println(Algorithm.isPalindrome("superpower"));

        System.out.println(Algorithm.stringsInAnotherString("Mississippi", "si"));
        System.out.println(Algorithm.stringsInAnotherString("qqqqq", "q"));
        System.out.println(Algorithm.stringsInAnotherString("qq", "qqq"));
    }
}
