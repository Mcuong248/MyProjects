import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    HashSet<String> countries = new HashSet<String>();

    public void add(){
        countries.add("Việt Nam");
        countries.add("American");
        countries.add("Mexico");
        countries.add("Việt Nam");
    }

    public void print(){
        for (String string : countries){
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        SetDemo set = new SetDemo();
        set.add();
        System.out.println("Danh sách ban đầu: ");
        set.print();

        set.countries.remove("Mexico");
        System.out.println("Danh sách sau khi xóa: ");
        set.print();

        System.out.println("In danh sách với iterator: ");
        Iterator itr = set.countries.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
