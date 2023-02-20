public class Product {
    public String id;
    public String name;
    public String description;
    public int amount;
    public long price;
    public String category;

    public Product(String id, String name, String description, int amount, long price, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
