import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public void createList() { //khởi tạo phương thức
        ArrayList<Integer> soNguyen = new ArrayList<>(); // Khởi tạo đối tượng
        soNguyen.add(1);
        soNguyen.add(2);
        soNguyen.add(3);
        soNguyen.add(4);
        soNguyen.add(5);
        soNguyen.add(6);
        soNguyen.add(7);
        System.out.println(soNguyen);

        System.out.println("Danh sách sau khi đã sửa: ");
        soNguyen.set(1,6);
        System.out.println(soNguyen);
        System.out.println("Danh sách sau khi đã thêm: ");
        soNguyen.add(4, 10);
        System.out.println(soNguyen);
        System.out.println("Danh sách sau khi đã xóa: ");
        soNguyen.remove(4);
        System.out.println(soNguyen);
    }
}
