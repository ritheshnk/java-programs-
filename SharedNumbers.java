public class SharedDigit {

    public static boolean shared(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            int num1val1 = num1 / 10;
            int num1val2 = num1 % 10;

            int num2val1 = num2 / 10;
            int num2val2 = num2 % 10;

            // Check if any digit of num1 matches any digit of num2
            if ((num1val1 == num2val1) || (num1val1 == num2val2) || (num1val2 == num2val1) || (num1val2 == num2val2)) {
                return true;
            }
        }

        return false;
    }

    public static void main (String[] args)

    {
        boolean isshared=shared(25,23);
        System.out.println(isshared);
    }
}
