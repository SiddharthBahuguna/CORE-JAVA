import java.util.*;

public class FirstNonRepeatingDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int temp = n;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int divisor = (int)Math.pow(10, count - 1);
        int result = -1;

        while (divisor != 0) {
            int digit = n / divisor;
            int check = n;
            int frequency = 0;

            while (check != 0) {
                if (check % 10 == digit) {
                    frequency++;
                }
                check = check / 10;
            }

            if (frequency == 1) {
                result = digit;
                break;
            }

            n = n % divisor;
            divisor = divisor / 10;
        }

        if (result != -1)
            System.out.println("First non-repeating digit = " + result);
        else
            System.out.println("No non-repeating digit");

        sc.close();
    }
}