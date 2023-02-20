public class Student {
    private int id;
    private String name;
    private int age;
    private String classroom;
    private double point;

    public Student(int id, String name, int age, String classroom, double point) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classroom = classroom;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + classroom + " - " + point;
    }
}
