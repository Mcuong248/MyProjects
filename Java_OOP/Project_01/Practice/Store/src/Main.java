public class Main {
    public static void main(String[] args) {
        Service s = new Service();
        Product[] pr = s.insertProduct();
        System.out.println("Danh sách sản phẩm: ");
        s.print(pr);
        s.searchByName(pr);
    }
}
