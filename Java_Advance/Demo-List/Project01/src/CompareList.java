import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareList {
    public static void main(String[] args) {
        Long start, end, timeElapsed;
        List<String> arrayList = new ArrayList<>();
        List<String> linkedLisst = new LinkedList<>();
        arrayList.add("Java");
        arrayList.add("HTML");
        arrayList.add("Python");

        linkedLisst.add("Java");
        linkedLisst.add("HTML");
        linkedLisst.add("Python");

        start = System.nanoTime();
        arrayList.remove(1);
        end = System.nanoTime();

        timeElapsed = end - start;
        System.out.println("Sử dụng arrayList: " + timeElapsed);

        start = System.nanoTime();
        linkedLisst.remove(1);
        end = System.nanoTime();

        timeElapsed = end - start;
        System.out.println("Sử dụng linkedList: " + timeElapsed);
    }
}
