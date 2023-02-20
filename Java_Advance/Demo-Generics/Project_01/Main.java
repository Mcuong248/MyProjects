import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        String [] languages = new String[3];
//        languages[0] = "Java";
//        languages[1] = "Ruby";
//        languages[2] = "Python";
//        ClassGenerics<String> generics = new ClassGenerics<String>(languages);
//
//        System.out.println("Phần tử ở vị trí cuối cùng: ");
//        System.out.println(generics.getLast());
//        generics.print(languages);
//
//        System.out.println("\n--------------------");
//
//        Integer[] numbers = new Integer[3];
//        numbers[0] = 5;
//        numbers[1] = 9;
//        numbers[2] = 3;
//
//        ClassGenerics<Integer> generics1 = new ClassGenerics<Integer>(numbers);
//        System.out.println(generics1.getLast());
//        generics1.print(numbers);

        Scanner sc = new Scanner(System.in);
//        ArrayList<String> names = new ArrayList<String>();
//        DemoArrayList<String> demo1 = new DemoArrayList<String>(names);
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("Thêm phần tử thứ %d: " , (i + 1));
//            String name = sc.nextLine();
//            demo1.add(name);
//        }
//
//        System.out.println("Danh sách: ");
//        demo1.print(names);
//
//        System.out.println("Nhập vị trí cần sửa: ");
//        int index = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Nhập phần tử mới: ");
//        String newElement = sc.nextLine();
//        demo1.edit(index, newElement);
//        System.out.println("Dánh sách sau khi sửa là: ");
//        demo1.print(names);
//
//        System.out.println("Nhập phần tử bạn muốn xóa");
//        String element = sc.nextLine();
//        demo1.delete(element);
//        System.out.println("Danh sách sau khi xóa: ");
//        demo1.print(names);
//
//
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        DemoArrayList<Integer> demo2 = new DemoArrayList<Integer>(numbers);
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("Thêm phần tử thứ %d: " , (i + 1));
//            Integer num = sc.nextInt();
//            demo2.add(num);
//        }
//        System.out.println("Danh sách: ");
//        demo2.print(numbers);

//        ArrayList<Double> doubles = new ArrayList<Double>();
//        DemoArrayList<Double> demo3 = new DemoArrayList<Double>(doubles);
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("Thêm phần tử thứ %d: " , (i + 1));
//            Double numDouble = sc.nextDouble();
//            demo3.add(numDouble);
//        }
//        System.out.println("Danh sách: ");
//        demo3.print(doubles);
//
//        System.out.println("Nhập vị trí cần sửa: ");
//        int index = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Nhập phần tử mới: ");
//        Double newElement = sc.nextDouble();
//        demo3.edit(index, newElement);
//        System.out.println("Dánh sách sau khi sửa là: ");
//        demo3.print(doubles);
//
//        System.out.println("Nhập phần tử bạn muốn xóa");
//        Double element = sc.nextDouble();
//        demo3.delete(element);
//        System.out.println("Danh sách sau khi xóa: ");
//        demo3.print(doubles);

        DemoWildCard demo = new DemoWildCard();
        System.out.println("Danh sách tên: ");
        demo.creatListName();

        System.out.println("Danh sách số: ");
        demo.creatListNumber();

    }
}
