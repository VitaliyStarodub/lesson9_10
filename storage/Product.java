package java_oop.lesson9_10.storage;

public class Product implements Entity<Long> {
    private final long id;
    private final String name;
    private final String description;
    private final long price;

    public Product(long id, String name, String description, long price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
