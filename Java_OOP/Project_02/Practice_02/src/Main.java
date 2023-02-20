import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Repository repo = new Repository();
        ArrayList<Film> listFilm = repo.getData(); //Lấy ra list film đã tạo

        Service service = new Service();
        Scanner sc = new Scanner(System.in);

        boolean isContinue = false;
        while(!isContinue){
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    service.insertFilm(listFilm);
                    break;
                case 2:
                    System.out.println("Danh sách các phim: ");
                    service.getListFilm(listFilm);
                    break;
                case 3:
                    String gender = "action";
                    service.getFilmByGender(listFilm, gender);
                    break;
                case 0:
                    isContinue = true;
                    System.exit(1);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }


        }

    }

    public static void menu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Thêm phim vào danh sách");
        System.out.println("2 - Hiển thi danh sách phim ra màn hình");
        System.out.println("3 - Lấy phim theo thể loại");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}

