import java.util.ArrayList;
import java.util.List;

public class DemoWildCard {
    List<String> names;
    List<Integer> numbers;

    public void creatListName(){
        names = new ArrayList<>();
        names.add("Cường");
        names.add("Thanh");
        names.add("Ngọc");
        print(names);
    }

    public void creatListNumber(){
        numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(6);
        numbers.add(0);
        print(numbers);
    }

    public void print(List<?> list){
        for (Object object : list){
            System.out.println(object);
        }
    }
}
