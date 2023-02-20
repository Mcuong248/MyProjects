public class Student extends Person {
    private float theoreticalPoint;
    private float practicePoint;


    public Student(String id, String name, int age, String address, float theoreticalPoint, float practicePoint) {
        super(id, name, age, address);
        this.theoreticalPoint = theoreticalPoint;
        this.practicePoint = practicePoint;
    }

    public float getTheoreticalPoint() {
        return theoreticalPoint;
    }

    public void setTheoreticalPoint(float theoreticalPoint) {
        this.theoreticalPoint = theoreticalPoint;
    }

    public float getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(float practicePoint) {
        this.practicePoint = practicePoint;
    }

    public double sumGPA() {
        return (theoreticalPoint + practicePoint) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + theoreticalPoint + " - " + practicePoint;
    }
}
