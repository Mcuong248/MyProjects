import java.util.Scanner;

public class KiemChungVien extends NhanVien{
    private int errorsDetected;

    public KiemChungVien(String id, String name, int age, int phoneNumber, String email, int salary, int errorsDetected) {
        super(id, name, age, phoneNumber, email, salary);
        this.errorsDetected = errorsDetected;
    }

    public int getErrorsDetected() {
        return errorsDetected;
    }

    public void setErrorsDetected(int errorsDetected) {
        this.errorsDetected = errorsDetected;
    }

    @Override
    public String toString() {
        return super.toString() + " số lỗi phát hiện được " + errorsDetected;
    }
}
