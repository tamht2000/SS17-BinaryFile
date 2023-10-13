package ra.bt1;

import java.io.Serializable;

import static ra.bt1.Main.sc;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int id;
    private static String name;
    private static String manufacturer;
    private static float price;
    private static String description;

    public Product() {
    }

    public Product(int id, String name, String manufacturer, float price, String description) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public void inputProduct() {
        System.out.printf("Nhập id sản phẩm: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.printf("Nhập tên sản phẩm: ");
        this.name = sc.nextLine();
        System.out.printf("Nhập hãng sản phẩm: ");
        this.manufacturer = sc.nextLine();
        System.out.printf("Nhập giá sản phẩm: ");
        this.price = Float.parseFloat(sc.nextLine());
        System.out.printf("Nhập mô tả sản phẩm: ");
        this.description = sc.nextLine();
    }
    public static void displayProduct() {
        System.out.printf("Id: %d - Tên: %s - Hãng: %s - Giá: %-2f - Mô tả: %s\n", id,name,manufacturer,price,description);
        System.out.println("----------------------------------------------------------------");
    }
}
