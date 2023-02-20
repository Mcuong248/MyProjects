import java.time.LocalDate;

public class Teacher extends Student{
    private long luong;

    public Teacher(String name, LocalDate date, String address, double point, long luong) {
        super(name, date, address, point);
        this.luong = luong;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + luong;
    }
}
