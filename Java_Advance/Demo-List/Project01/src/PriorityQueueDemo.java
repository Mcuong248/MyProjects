import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> names = new PriorityQueue<>();

        names.add("Cường");
        names.add("Huy");
        names.add("Xuân");
        names.add("Long");
        System.out.println("Danh sách ban đầu: ");
        System.out.println(names);

        System.out.println("Phần tử đầu tiên: " + names.peek());

        System.out.println("Phần tử ở vị trí đầu tiên: " + names.poll());
        System.out.println("Danh sách sau khi xóa: ");
        System.out.println(names);

        names.offer("Thanh");
        names.offer("Ngọc");
        names.offer("Bình");
        System.out.println("Danh sách sau khi thêm: ");
        System.out.println(names);

        System.out.println("Phần từ đầu tiên: " + names.element());
    }
}
