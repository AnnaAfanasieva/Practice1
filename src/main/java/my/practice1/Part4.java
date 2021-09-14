package my.practice1;

public class Part4 {
    static int result;

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        result = nod(num1, num2);
        System.out.println(result);
    }

    private static int nod(int num1, int num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) num1 = num1 % num2;
            else num2 = num2 % num1;
        }
        return num1 + num2;
    }
}
