package my.practice1;

public class Part5 {
    static int result;

    public static void main(String[] args) {
        result = sumOfNumbers(Integer.parseInt(args[0]));
        System.out.print(result);
    }

    private static int sumOfNumbers(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }
}
