package menu;

public class Product {

    private int id;
    private String name;

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }



    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }



}
