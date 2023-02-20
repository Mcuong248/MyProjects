public class Main {

    enum Season {
        SPRING, SUMMER, AUTUMN, WINNER
    }

    public static int number;
    static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.println("Hello Wordl");
        number = 11;
        int age = 20;
        double d = Math.sqrt(7);
        System.out.println(d);

        Main m = new Main(); // Khởi tạo đối tượng
        m.method();

        int tong = m.sum();
        System.out.println(tong);

        System.out.println(m.sum());

        double bmi = m.bmi(1.65, 50);
        System.out.println("chỉ số bmi là: " + bmi);

        String str = "Cường";
        String str3 = "";
        System.out.println("Kích thước chuỗi: " + str.length());
        System.out.println("Chữ viết in hoa: " + str.toUpperCase());
        System.out.println("Chữ viết in thường: " + str.toLowerCase());
        System.out.println("Kiểm tra chuỗi có rỗng không: " + str3.isEmpty());

        String str2 = new String("cường");
        System.out.println("Kiểm tra chuỗi có rỗng không: " + str2.isEmpty());
        System.out.println("So sánh 2 chuỗi: " + str.equals(str2)); // Phân biệt chữ hoa chữ thường
        System.out.println("So sánh 2 chuỗi: " + str.equalsIgnoreCase(str2)); // Không phân biệt chữ hoa thường

        String str4 = "ng";
        System.out.println("Sử dụng contain: " + str2.contains(str4)); // Kiểm tra chuỗi có chứa chuỗi kí tự hay ko (Có phân biệt chữ hoa, chữ thường)
        System.out.println("Sử dụng compareTo(): " + str2.compareTo(str));

        Person p = new Person(); // Tạo đối tượng (Vì chưa có static)
        p.display("Cường", 21, "Hà Nội"); // Gọi tới phương thức display()

        System.out.println("Xin chào \t các bạn!!!");

        method();

        Person.display("Cường", 21, "Hà Nội"); // Gọi tới phương thức display() (Có chứa static)

        Season s = Season.SPRING;
        System.out.println(s);

        Position p = Position.GK; // Khởi tạo đối tượng gọi tới ENUM
        System.out.println("Thủ môn là: " + p);
        System.out.println(p.getValue());
    }

    public static void method() {
//        number = 20;
//        System.out.println(number);
        System.out.println("PI = " + Main.PI);
    }

    public int sum() {
        int a = 5;
        int b = 7;

        int c = a + b;
        return c;
    }

    public double bmi(double height, double weight) {
        return weight / (height * height);
    }
}
