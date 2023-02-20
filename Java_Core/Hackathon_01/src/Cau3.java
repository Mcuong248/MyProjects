import java.util.Random;

public class Cau3 {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void randomNumber() {
        Random rd = new Random();
        int number = rd.nextInt(100);
        if (isPrimeNumber(number)) {
            System.out.println(number + " Là số nguyên tố");
        }else {
            System.out.println(number + " Không phải là số nguyên tố");
        }
    }
}
