import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public static void input() {
        ArrayList<SchoolBook> listSchoolBook = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sách cần thêm: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập mã sách: ");
            String id = sc.nextLine();
            System.out.println("Nhập tên sách: ");
            String name = sc.nextLine();
            System.out.println("Nhà xuất bản: ");
            String author = sc.nextLine();
            System.out.println("Nhập năm xuất bản: ");
            int year = Integer.parseInt(sc.nextLine());
            System.out.println("Số lượng: ");
            int quantity = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số trang: ");
            int pageNumber = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập tình trạng: ");
            String tinhTrang = sc.nextLine();
            System.out.println("Nhập số lượng mượn: ");
            int quantityMuon = Integer.parseInt(sc.nextLine());

            SchoolBook newsSchoolBook = new SchoolBook(id, name, author, year, quantity, pageNumber, tinhTrang, quantityMuon);
            listSchoolBook.add(newsSchoolBook);
        }
        for (SchoolBook schoolBook : listSchoolBook) {
            System.out.println("Thêm thành công: \n" + schoolBook);
        }
    }
}

