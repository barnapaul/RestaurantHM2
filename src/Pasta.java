public class Pasta extends Product {
    public Pasta(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public String toString() {

        return getId() + " " + getName() + "\n";
    }
}
