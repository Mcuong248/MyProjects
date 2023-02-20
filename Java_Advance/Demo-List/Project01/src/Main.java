public class Main {
    public static void main(String[] args) {
        ListDemo list = new ListDemo();
        list.add();

        System.out.println("Danh sách ban đầu: ");
        list.print();

        list.set();
        System.out.println("Danh sách sau khi sửa: ");
        list.print();

        list.delete();
        System.out.println("Danh sách sau khi xóa: ");
        list.print();
    }
}
