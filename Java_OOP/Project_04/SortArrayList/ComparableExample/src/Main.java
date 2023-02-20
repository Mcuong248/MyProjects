import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Cường", 21, "HN"));
        listPerson.add(new Person("Thanh", 22, "Ba Vì"));
        listPerson.add(new Person("Ngọc", 46, "Long Biên"));
        listPerson.add(new Person("Victor", 19, "American"));

        System.out.println("Danh sách ban đầu: ");
        show(listPerson);

        Collections.sort(listPerson);
        System.out.println("Danh sách sau khi sắp xếp: ");
        show(listPerson);
    }

    public static void show(ArrayList<Person> listPerson) {
        for (Person p : listPerson) {
            System.out.println(p);
        }
    }
}
