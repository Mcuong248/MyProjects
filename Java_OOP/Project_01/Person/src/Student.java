public class Student {
    public String id;
    public String name;
    public double theoreticalPoint;
    public double practicePoints;
    public String school;

    public Student() {
    }

    public Student(String id, String name, double theoreticalPoint, double practicePoints, String school) {
        this.id = id;
        this.name = name;
        this.theoreticalPoint = theoreticalPoint;
        this.practicePoints = practicePoints;
        this.school = school;
    }

    public double dTB(){
        return (theoreticalPoint+practicePoints)/2;
    }

    @Override
    public String toString() {
        return id+ " - " +name+ " - " +theoreticalPoint+ " - "+practicePoints+ " - "+school+" - " +dTB();
    }
}
