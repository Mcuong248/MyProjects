public class Bmi {
    public static void TinhBmi(double height, double weight) {
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Thiếu cân");
        } else if (18.5 <= bmi && bmi <= 24.9) {
            System.out.println("Cân đối");
        } else {
            System.out.println("Thừa cân");
        }
    }
}
