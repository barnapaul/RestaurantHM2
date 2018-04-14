public class Pizza extends Product {


    public Pizza(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return getId() + ". " + getName() + " " + getPrice() + "\n";
    }
}


