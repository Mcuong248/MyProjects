import java.util.Scanner;

public class Service {
    Scanner sc = new Scanner(System.in);
    public Product[] insertProduct() {
        System.out.println("Nhập số lượng sản phẩm: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập id sản phẩm: ");
            String id = sc.nextLine();
            System.out.println("Nhập tên sản phẩm: ");
            String name = sc.nextLine();
            System.out.println("Nhập mô tả sản phẩm: ");
            String description = sc.nextLine();
            System.out.println("Nhập số lượng sản phẩm: ");
            int amount = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập giá bán: ");
            long price = Long.parseLong(sc.nextLine());
            System.out.println("Nhập loai sản phẩm: ");
            String category = sc.nextLine();

            products[i] = new Product(id, name, description, amount, price, category);
        }
        return products;
    }

    public void print(Product[] products) {
        for (Product p: products ) {
            System.out.println(p);
        }
    }

    public void searchByName(Product[] products) {
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String findName = sc.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i].name.toLowerCase().contains(findName.toLowerCase())) {
                System.out.println(products[i]);
            }
        }
    }
}
