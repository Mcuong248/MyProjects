import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public static void insertStudent() {
        ArrayList<Student> listStudent = new ArrayList<>();
        System.out.println("Thêm số lượng sinh viên: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập id sinh viên: ");
        String id = sc.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ sinh viên: ");
        String address = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        float theoreticalPoint = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập điểm thực hành: ");
        float practicePoint = Float.parseFloat(sc.nextLine());

        Student students = new Student(id, name, age, address, theoreticalPoint, practicePoint);
        System.out.println(students);
        listStudent.add(students);

        for (Student student : listStudent) {
            System.out.println(student);
        }
    }
        public static void insertTeacher () {
        ArrayList<Teacher> listTeacher = new ArrayList<>();
        System.out.println("Thêm số lượng giáo viên: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập id giáo viên: ");
        String id = sc.nextLine();
        System.out.println("Nhập tên giáo viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi giáo viên: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập địa chỉ giáo viên: ");
        String address = sc.nextLine();
        System.out.println("Nhập lương giáo viên: ");
        long salary = Long.parseLong(sc.nextLine());

        Teacher teachers = new Teacher(id, name, age, address, salary);
        System.out.println(teachers);
        listTeacher.add(teachers);
    }
}
