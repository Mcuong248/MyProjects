import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Service service;
    ArrayList<Person> listPerson;
    Scanner sc = new Scanner(System.in);

    public Controller() {
        service = new Service();
        listPerson = service.getData();
        sc = new Scanner(System.in);
    }

    public void mainMenu(){
        boolean isCheck = false;
        while (!isCheck){
            System.out.println("Nhập lựa chọn của bạn: ");
            int choise = sc.nextInt();
            switch (choise){
                case 1:
                    System.out.println("Danh sách: ");
                    service.printList(listPerson);
                    break;
                case 2:
                    //
            }
        }
    }
}
