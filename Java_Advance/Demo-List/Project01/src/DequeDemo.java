import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> names = new ArrayDeque<>();
        names.add("Hoa");
        names.add("Vũ");
        names.add("Tùng");
        names.add("Cường");

        System.out.println("Danh sách ban đầu: ");
        System.out.println(names);

        names.addFirst("Sơn");
        names.offerFirst("Mạnh");
        System.out.println("Danh sách sau khi thêm vào vị trí đầu tiên: ");
        System.out.println(names);

        names.addLast("Khiêm");
        names.offerLast("Phán");
        System.out.println("Danh sách sau khi thêm vào vị trị cuối cùng");
        System.out.println(names);

        System.out.println("Phần từ đầu tiên: " + names.getFirst());

        System.out.println("Phần từ đầu tiên: " + names.peekFirst());

        System.out.println("Phần từ cuối cùng: " + names.getLast());
        System.out.println("Phần từ cuối cùng: " + names.peekLast());

        System.out.println("Phần tử ở vị trí đầu tiên: " + names.removeFirst());
        System.out.println("Phần tử ở vị trí đầu tiên: " + names.pollFirst());
        System.out.println("Danh sách sau khi xóa: ");
        System.out.println(names);

        System.out.println("Phần tử ở vị trí cuối cùng: " + names.removeLast());
        System.out.println("Phần tử ở vị trí cuối cùng: " + names.pollLast());
        System.out.println("Danh sách sau khi xóa: ");
        System.out.println(names);
    }


}
