// I have neither given nor received unauthorized aid on this piece of work.

public class Main {

    public static void main(String[] args) {

    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name)
    {
        return name;
    }
    // 5. triple
    public static String triple(String word)
    {
        return word;
    }
        public static String triple(String word) {
            return word + word + word;
        }
    // 6. half
    public static double half(int number) {
        return number / 2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double number) {
        int roundedValue = (int) Math.round(number);
        return roundedValue;
    }


    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double number) {
        int roundedValue = (int) Math.round(number);
        return roundedValue;

    }

