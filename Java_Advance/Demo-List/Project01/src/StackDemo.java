import java.util.Stack;


public class StackDemo {
    // Truy cập và lưu trữ theo cơ chế last in first out, LIFO
    Stack<String> names = new Stack<>();

    public void add(){
        names.push("Cường");
        names.push("Ngọc");
        names.push("Quang");
        names.push("Quang");
        names.push("Huy");
    }

    public void set(){
        names.set(0,"Toàn");
    }

    public void print(){
        for (String string : names){
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        StackDemo stack = new StackDemo();
        stack.add();
        System.out.println("Danh sách ban đầu: ");
        stack.print();

        stack.set();
        System.out.println("Danh sách sau khi sửa: ");
        stack.print();

        System.out.println("Phần tử ở phía trên cùng: " + stack.names.peek());

        System.out.println("Phần tử ở phía trên cùng: " + stack.names.pop());
        System.out.println("Danh sách sau khi xóa: ");
        stack.print();

        System.out.println("Vị trí của phần tử Quang: " + stack.names.search("Quang"));

        System.out.println("Danh sách có rỗng không: " + stack.names.empty());

        System.out.println("Phần tử Toàn có index là: " + stack.names.lastIndexOf("Toàn"));
    }
}
