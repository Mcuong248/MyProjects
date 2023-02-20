import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Person p = new Person("Cường", 21, "HN");
//        System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getAddress());
//
//        p.setName("Thanh");
//        p.setAge(26);
//        System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getAddress());

//        ArrayList<String> list = new ArrayList<>(); // Khởi tạo đối tượng ArrayList
//        list.add("HTML/CSS");
//        list.add("JS");
//        list.add("Database");
//        list.add("Spring Boot");
//
//        System.out.println(list);
//
//        printList(list);
//
//        list.add(1,"Java");
//        System.out.println("Danh sách sau khi chèn: ");
//        printList(list);
//
//        list.set(1,"Java core");
//        System.out.println("Danh sách sau khi sửa: ");
//        printList(list);
//
//        list.remove("Database");
//        System.out.println("Danh sách sau khi xóa: ");
//        printList(list);
//
//        list.remove(1);
//        System.out.println("Danh sách sau khi xóa: ");
//        printList(list);
//        System.out.println("Kích thước: " + list.size());
//
//        list.clear();
//        System.out.println("Kích thước sau khi xóa toàn bộ: " + list.size());
//    }

//    public static void printList(ArrayList<String> list) {
//        for (String str : list) {
//            System.out.println(str);
//        }

//        ArrayListDemo arrDemo = new ArrayListDemo(); // khởi tạo đối tượng
//        arrDemo.createList(); //gọi tới phương thức

//        ArrayList<Person> listPerson = new ArrayList<>();
//        Person p = new Person("Cường", 21, "HN");
//        listPerson.add(p);
//        listPerson.add(new Person("Thanh", 21, "HN"));
//        listPerson.add(new Person("Ngọc", 46, "HN"));
//        listPerson.add(new Person("Nga", 18, "HN"));
//
//        for (Person person : listPerson) {
//            System.out.println(person);
//        }
//
//        System.out.println("Danh sách những người 22 tuổi: ");
//        for (int i = 0; i < listPerson.size(); i++) {
//            if (listPerson.get(i).getAge() == 21) {
//                System.out.println(listPerson.get(i));
//            }
//        }

        ArrayList<Shop> shops = new ArrayList<>();
        shops.add(new Shop(19150083, "Iphone", "Điện thoại", 200, 110000, "IphoneX"));
        shops.add(new Shop(19150084, "Samsung", "Điện thoại", 500, 10000, "Samsung J3"));
        shops.add(new Shop(19150085, "Oppo", "Điện thoại", 100, 1000, "Oppo A300"));
        shops.add(new Shop(19150086, "Xioami", "Điện thoại", 300, 300000, "Xioamiiii"));

        for (Shop shop : shops){
            System.out.println(shop);
        }
        System.out.println("Danh sách những sản phẩm có số lượng trên 200");
        for (int i = 0; i < shops.size(); i++) {
            if (shops.get(i).getQuantity() >= 200) {
                System.out.println(shops.get(i));
            }
        }

    }
}
