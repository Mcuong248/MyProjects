import java.util.List;
import java.util.Vector;

public class DemoVector {
    List<String> names = new Vector<String>();

    public void add(){
        names.add("Cường");
        names.add("Duy");
        names.add(1,"Duy");
    }

    public void set(){
        names.set(1,"Ngọc");
    }

    public void delete(){
        names.remove(1);
        names.clear();
    }
}
