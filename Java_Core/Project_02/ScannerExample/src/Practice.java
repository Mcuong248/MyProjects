import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void ssHaiSo() {
        System.out.println("Nhập số từ bàn phím: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rd = new Random();
        int rdNumber = rd.nextInt(10);
        System.out.println("Số random là: " + rdNumber);
        System.out.println("Số lớn nhất trong 2 số là: " + Math.max(n,rdNumber));
    }
}
