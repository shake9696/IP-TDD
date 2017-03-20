/**
 * Created by Alex on 20-Mar-17.
 */
public class MathService {
    public static boolean isDivisibleByFour(int year) {
        return year % 4 == 0;
    }
    public static boolean isDivisibleByOneHundred(int year) {
        return year % 100 == 0;
    }
    public static boolean isDivisibleByFourHundred(int year) {
        return year % 400 == 0;
    }
    public static boolean isDivisibleByFourAndNotByOneHundred(int year) {
        return (isDivisibleByFour(year) && !isDivisibleByOneHundred(year));
    }
    public static boolean isLeapYear(int year) {
        return (isDivisibleByFourAndNotByOneHundred(year) || isDivisibleByFourHundred(year));
    }
}