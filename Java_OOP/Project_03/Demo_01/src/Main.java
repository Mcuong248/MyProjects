import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SchoolBook> schoolBookArrayList = new ArrayList<>();
        schoolBookArrayList.add(new SchoolBook("1", "gfgd", "dfgg", 2000, 20, 6, "new", 12));
        Service.input();
        for (SchoolBook schoolBook : schoolBookArrayList) {
            System.out.println(schoolBook);
        }
    }
}


