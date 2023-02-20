import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings({"deprecation", "checked"}) // annotation loại bỏ cảnh báo
        Scanner sc = new Scanner(System.in);

//        boolean isCheck = false;
//        while (!isCheck) {
//            try {
//                System.out.println("Nhập a: ");
//                int a = Integer.parseInt(sc.nextLine());
//                System.out.println("Nhập b: ");
//                int b = Integer.parseInt(sc.nextLine());
//                // Đoạn code có thể ném ra ngoại lệ
//                int c = a/b;
//                System.out.println(c);
//                isCheck = true;
//            }catch (ArithmeticException e) {
//                // Xử lý ngoại lệ
//                System.out.println("Sảy ra ngoại lệ, yêu cầu nhập lại!!!");
//            }catch (NumberFormatException e) {
//                System.out.println("Bạn phải nhập số, vui lòng nhập lại");
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                e.printStackTrace();
//            }finally {
//                System.out.println("Khối này luôn được thực thi");
//            }
//        }

//        boolean isCheck = false;
//        while (!isCheck) {
//            try {
//                System.out.println("Nhập chiều cao: ");
//                double height = input();
//                if (height <= 0) throw new ArithmeticException("Chiều cao cần lớn hơn 0");
//                System.out.println("Nhập cân nặng: ");
//                double weight = input();
//
//                double bmi = weight / (height * height);
//                System.out.println("Chỉ số bmi của bạn là: " + bmi);
//                isCheck = true;
//            } catch (ArithmeticException e) {
//                System.out.println(e.getMessage() + " , " + "Vui lòng nhập lại.");
//            } catch (NumberFormatException e) {
//                System.out.println(e.getMessage() + " , vui lòng nhập lại.");
//            }
//        }
//        System.out.println("Nhập chiều cao: ");
//        double height = input();
//        System.out.println("Nhập cân nặng: ");
//        double weight = input();
//
//        double bmi = weight / (height * height);
//        System.out.println("Chỉ số bmi của bạn là: " + bmi);
//
//        try {
//            int age = checkAge();
//            if (age >= 18) {
//                System.out.println("Bạn đủ tuổi bầu cửa");
//            }else {
//                System.out.println("Bạn chưa đủ tuổi");
//            }
//        }catch (NumberFormatException e) {
//            System.out.println("Tuổi không hợp lệ");
//        }catch (MyException e) {
//            System.out.println(e.getMessage());
//        }
//
//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getDate());

//        Person p = new Person("Cường", 21);
//        p.display();

        addEmployee();

//        Person p1 = new Person("Thanh", 22);
    }

    public static double input() {
        Scanner sc = new Scanner(System.in);
        double number = 0;
        boolean isCheck = false;
        while (!isCheck) {
            try {
                number = Double.parseDouble(sc.nextLine());
                if (number <= 0) throw new ArithmeticException("Nhập số không hợp lệ");
                isCheck = true;
            }catch (ArithmeticException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            }catch (NumberFormatException e){
                System.out.println("Bạn cần phải nhập số, vui lòng nhập lại");
            }
        }
            return number;
    }

    public static int checkAge() throws MyException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tuổi của bạn: ");
        int age = Integer.parseInt(sc.nextLine());
        if (age <= 0) throw new MyException("Tuổi phải lớn hon 0");
        return age;
    }

    public static String checkEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập email của bạn: ");
        String email = null;
        boolean isCheck = false;
        while (!isCheck){
            try{
                email = sc.nextLine();
                if (!Validate.emailValidator(email)) throw new MyException("Email không đúng định dạng");
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            }
        }
        return email;
    }
    public static void addEmployee(){
        Scanner sc = new Scanner(System.in);
        boolean isCheck = false;
        while (!isCheck){
            try{
                System.out.println("Nhập thông tin nhân viên: ");
                System.out.println("Nhập id: ");
                int id = Integer.parseInt(sc.nextLine());
                if (id < 0) throw new MyException("Bạn phải nhập số dương");
                System.out.println("Nhập tên: ");
                String name = sc.nextLine();
                System.out.println("Nhập email: ");
                String email = sc.nextLine();
                if (!Validate.emailValidator(email)) throw new MyException("Email không đúng định dạng");
                System.out.println("Nhập số điện thoại: ");
                String number = sc.nextLine();
                if (!Validate.phoneValidator(number)) throw new MyException("Số điện thoại không đúng định dạng");
                System.out.println("Nhập lương: ");
                int salary = Integer.parseInt(sc.nextLine());
                if (salary < 0) throw new MyException("Bạn phải nhập số dương");

                Employee employee = new Employee(id,name,email,number,salary);
                System.out.println(employee);
                isCheck = true;
            } catch (MyException e) {
                System.out.println(e.getMessage() + ", vui lòng nhập lại");
            }
        }
    }
}

