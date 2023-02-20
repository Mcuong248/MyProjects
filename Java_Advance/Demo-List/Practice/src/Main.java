import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Cường", 23, "Java", 8.5));
        students.add(new Student(2,"Sơn", 24, "SQL", 9.5));
        students.add(new Student(3,"Vũ", 20, "HTML/CSS", 8.6));
        students.add(new Student(4,"Tùng", 26, "SQL", 8.7));
        students.add(new Student(5,"Hoa", 23, "Java", 8));

        for (Student student : students){
            System.out.println(student);
        }

        Map<Integer, String> s = new HashMap<>();
        for (Student student : students){
            Integer id = student.getId();
            String value = student.getName() + " - " + student.getPoint();
            s.put(id, value);
        }
        for (Map.Entry<Integer, String> entry : s.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<String, Integer> countStudent = new HashMap<>();
        for (Student student : students){
            if (!countStudent.containsKey(student.getClassroom())){
                countStudent.put(student.getClassroom(), 1);
            }else {
                countStudent.put(student.getClassroom(), countStudent.get(student.getClassroom()) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : countStudent.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
