public class Person {
    public String name;
    public int age;
    public String address;

    public static String school = "Techmaster"; // Biến static

    public static void changeSchool() {
        school = "CNTT"; // Biến static chỉ đc gọi trong phương thức static và chỉ trong đây mới sửa đổi thông tin đc
    }

    static { // Khối đc thực hiện trc hàm main
        System.out.println("Gọi tới khối static");
    }

    // Tạo constructor mặc định
    public Person() {
        System.out.println("Gọi tới constructor mặc định");
    }

    // Constructor có tham số
//    public Person(String ten, int tuoi, String diachi) {
//        name = ten;
//        age = tuoi + 3;
//        address = diachi;
//    }


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void study() {
        System.out.println(name + " Đi học");
    }

    @Override
    public String toString() { // Khởi tạo phương thức toString()
        return name + " - " + age + " - " + address;
    }
}
