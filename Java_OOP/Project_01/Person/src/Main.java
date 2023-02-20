import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Person cuong = new Person(); // Gọi tới constructor mặc định
//        cuong.name = "Mạnh Cường";
//        cuong.age = 21;
//        cuong.address = "Hà Nội";
//        System.out.println(cuong.toString()); // Gọi tới phương thức toString()
//        cuong.study();
//
//        Person thanh = new Person();
//        thanh.name = "Hồng Thanh";
//        thanh.age = 22;
//        thanh.address = "Ba Vì";
//        System.out.println(thanh); // Khi đã khởi tạo phương thức toString thi ko cần gọi
//        thanh.study();
//
//        Person ngoc = new Person("Ngọc", 46, "HN"); // Gọi tới constructor có tham số
//        System.out.println(ngoc);
//
//        Dog dog = new Dog("Neapolitan Mastiff", "Large", 5, "black");
//        Dog dog1 = new Dog("Maltese", "Smaill", 2, "white");
//        Dog dog2 = new Dog("Chow chow", "Midium", 3, "brown");
//        System.out.println(dog);
//        System.out.println(dog1);
//        System.out.println(dog2);


        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số học sinh: ");
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        Person persons[] = new Person[n]; // Khởi tạo mảng
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập tên: ");
//            String name = sc.nextLine();
//            System.out.println("Nhập tuổi: ");
//            int age = Integer.parseInt(sc.nextLine());
//            System.out.println("Nhập địa chỉ: ");
//            String address = sc.nextLine();
//
//            Person p = new Person(name, age, address); // Tạo đối tượng mới
//            persons[i] = p; // Gán đối tượng mới vào mảng ở vị trí i
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(persons[i]);
//        }

        System.out.println("Nhập số học sinh: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student students[] = new Student[n]; // Khởi tạo mảng
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập id của học sinh: ");
            String id = sc.nextLine();
            System.out.println("Nhập tên của học sinh: ");
            String name = sc.nextLine();
            System.out.println("Nhập điểm lý thuyết của học sinh: ");
            Double theoreticalPoint = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập điểm thực hành của học sinh: ");
            Double practicePoints = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập tên trường của học sinh: ");
            String school = sc.nextLine();

            students[i] = new Student(id, name, theoreticalPoint, practicePoints, school); // Tạo đối tượng mới và gán đối tượng mới vào mảng
        }

        // In bằng forEach
            for(Student student : students){
                System.out.println(student);
            }
            // In bằng for thường
//        for (int i = 0; i < n; i++) {
//            System.out.println(students[i]);
//        }

//        System.out.println("Nhập số xe: ");
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        Car[] cars = new Car[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Nhập tên xe: ");
//            String model = sc.nextLine();
//            System.out.println("Nhập màu xe: ");
//            String color = sc.nextLine();
//            System.out.println("Nhập hãng xe: ");
//            String brand = sc.nextLine();
//
//            cars[i] = new Car(model, color, brand);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(cars[i]);
//        }
    }
}
