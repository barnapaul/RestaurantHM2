package menu;

public class SauceDressing extends Product {
    public SauceDressing(int id, String name, int price) {
        super(id, name, price);
    }
    @Override
    public String toString() {
        return getId() + ". Sauce / Dressing:  " + getName() + "\n\t\tPrice:  " + getPrice() + "\n";
    }
}
