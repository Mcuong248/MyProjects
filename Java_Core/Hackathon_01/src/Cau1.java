import java.util.Scanner;

public class Cau1 {
    public static void printSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("In hình vuông");
        System.out.println("Nhập cạnh của hình vuông: ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(" * \t");
            }
            System.out.println();
        }

        System.out.println("Nhập chiều cao của tam giác: ");
        int hight = sc.nextInt();
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        int chieucao, k = 0;
        System.out.printf("\n\nNhập vào chiều cao của kim tự tháp: ");
        chieucao = sc.nextInt();
        for (int i = 1; i <= chieucao; ++i, k = 0) {
            for (int space = 1; space <= hight - i; ++space) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}

