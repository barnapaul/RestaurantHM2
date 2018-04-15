package menu;

public class Desert extends Product {
    public Desert(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return getId() + ". Product: " + getName() + "\n\t\t Price: " + getPrice() + "\n";
    }
}
