public class Teacher extends Person {
    private long salary;

    public Teacher(String id, String name, int age, String address, long salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + salary;
    }
}
