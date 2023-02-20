import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        for (int i = 9; i >= 0; i--) {
//            System.out.println(i * 10);
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 0; i < 100; i++) {
//            if (i%2 == 0) {
//                System.out.println(i);
//            }
//        }

//        int number = 0;
//        while (number <= 10) {
//            System.out.println(number);
//            number++;
//        }

        boolean isCheck = true;
        while (isCheck) {
            if (10 % 2 == 0) {
                System.out.println("hello");
                isCheck = false;
            }else {
                System.out.println("Goodbye");
                isCheck = true;
            }
        }

        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số bất kì");
//        int num = 0;
//        while (num <= 0) {
//            System.out.println("Vui lòng nhập lại");
//            num = sc.nextInt();
//        }
//        System.out.println("Số bạn vừa nhập là: " + num);

//        int num = 0;
//        do {
//            System.out.println("Vui lòng nhập lại: ");
//            num = sc.nextInt();
//        }while (num > 0);

//        FizzBuzz.FindFizzBuzz();

        String str = "Hello";
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");

        for (int i = str.length() -1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
