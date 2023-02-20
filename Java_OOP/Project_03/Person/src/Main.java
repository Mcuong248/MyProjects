import java.time.LocalDate;

public class  Main {
    public static void main(String[] args) {
        Student s = new Student("Thanh", LocalDate.of(2000, 9, 24), "HN", 9);
        System.out.println(s);

        Teacher t = new Teacher("Cường", LocalDate.now(), "HN", 9, 2000);
        System.out.println(t);
    }
}
