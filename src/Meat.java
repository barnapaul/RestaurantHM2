public class Meat extends Product {
    public Meat(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public String toString() {

        return getId() + " " + getName() + "\n";
    }
}
