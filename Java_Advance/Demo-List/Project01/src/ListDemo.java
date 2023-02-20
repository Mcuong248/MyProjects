import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    List<String> names = new LinkedList<String>();

    public void add() {
        names.add("Cường");
        names.add("Hùng");
        names.add("Thanh");
        names.add("Tuấn");
    }

    public void set(){
        names.set(1, "Quang");
    }

    public void delete(){
        names.remove(0);
    }

    public void print(){
        for(String string : names){
            System.out.println(string);
        }
    }

}
