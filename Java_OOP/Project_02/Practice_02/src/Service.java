import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    // In ra thông tin của tất cả bộ phim
    public void getListFilm(ArrayList<Film> listFilm){
        for(Film film : listFilm){
            System.out.println(film);
        }
    }

    // Thêm phim vào trong danh sách phim
    public void insertFilm(ArrayList<Film> listFilm){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin phim: ");
        int id = listFilm.size();
        System.out.println("Nhập tên phim: ");
        String title = sc.nextLine();
        System.out.println("Nhập thể loại: ");
        String gender = sc.nextLine();
        System.out.println("Nhập độ dài: ");
        int length = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập nhà sản xuất: ");
        String publishingCompany = sc.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int publishingYear = Integer.parseInt(sc.nextLine());

        Film newFilm = new Film(id, title, gender, length, publishingCompany, publishingYear); //Tạo đối tượng phim mới
        System.out.println("Thêm thành công\n"+newFilm);
        listFilm.add(newFilm); //Thêm vào ArrayList
    }

    // Lấy phim theo thể loại
    public void getFilmByGender(ArrayList<Film> listFilm, String gender){
        boolean isCheck = false;
        for(int i = 0; i < listFilm.size(); i++){
            if(listFilm.get(i).getGender().toLowerCase().contains(gender.toLowerCase())){
                System.out.println(listFilm.get(i));
                isCheck = true;
            }
        }
        if(!isCheck){
            System.out.println("Không tồn tại phim có thể loại này");
        }
    }
}

