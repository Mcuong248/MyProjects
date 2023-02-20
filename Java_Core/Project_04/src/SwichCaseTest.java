import java.util.Scanner;

public class SwichCaseTest {
    public static void DateMonth() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number){
            case 1,3,5,7,8,10,12:
                System.out.println("Có 31 ngày");
                break;
            case 2:
                System.out.println("Có 28 ngày");
                break;
            case 4,6,9,11:
                System.out.println("Có 31 ngày");
                break;
            default:
                System.out.println("Không có ngày này");
                break;
        }
    }
}
