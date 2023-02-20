import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cinema> cinemas = new ArrayList<>();
        cinemas.add(new Cinema("19150083", "Avengers", "Action", 2, "Mavel Studios", 2012));
        cinemas.add(new Cinema("123456","Joker","psychology",2,"Todd Phillips",2019));
        cinemas.add(new Cinema("19150082","The TranSporter","Action",1,"Luc Besson",2002));
        cinemas.add(new Cinema("456789","The exorcist","horror",2,"William Friedkin",1973));
        cinemas.add(new Cinema("159753","Bố già","humor",2,"Trấn Thành",2021));

        for (Cinema cinema : cinemas) {
            System.out.println(cinema);
        }

        System.out.println("Danh sách những phim có thể loại là 'Action': ");
        for (int i = 0; i < cinemas.size(); i++) {
            if (cinemas.get(i).getCategory().equals("Action")) {
                System.out.println(cinemas.get(i));
            }
        }
    }
}

