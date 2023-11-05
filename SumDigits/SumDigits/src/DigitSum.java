import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem adjon meg egy nem negatív egész számot: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Érvénytelen bemenet, csak nem negatív egész számokat fogadunk el.");
        } else {
            int sum = calculateDigitSum(n);
            System.out.println("A(z) " + n + " szám számjegyeinek összege: " + sum);
        }
    }

    public static int calculateDigitSum(int n) {
        if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            return lastDigit + calculateDigitSum(remainingDigits);
        }
    }
}
