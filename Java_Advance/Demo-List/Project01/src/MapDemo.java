import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> persons = new HashMap<>();
        persons.put("001201004833", "Cường");
        persons.put("0123456789", "Hoàng");
        persons.put("0789456123", "Tùng");
        persons.put("159753456", "Thành");

        System.out.println(persons);

        for (Map.Entry<String, String> entry : persons.entrySet()){
            System.out.println(entry);
        }

        persons.remove("001201004833");
        System.out.println("Danh sách sau khi xóa: ");
        for (Map.Entry<String, String> entry : persons.entrySet()){
            System.out.println(entry);
        }

        persons.put("0789456123", "TungBeng");
        System.out.println("Danh sách sau khi sửa: ");
        for (Map.Entry<String, String> entry : persons.entrySet()){
            System.out.println(entry);
        }
    }
}
