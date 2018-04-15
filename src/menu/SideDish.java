package menu;

public class SideDish extends Product {


    public SideDish(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return getId() + ". Side Dish:  " + getName() + "\n\t\tPrice:  " + getPrice() + "\n";
    }
}
