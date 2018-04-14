import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static final ArrayList<Product> products = new ArrayList<>();


    public static ArrayList<Product> setProducts() {

        products.add(new Pizza(1,"Capriciosa",20));
        products.add(new Pizza(2,"Quattro stagioni",21));
        products.add(new Pizza(3,"Margherita",22));
        products.add(new Pizza(4,"Prosciuto e funghi",23));

        products.add(new Pasta(5,"Carbonara",27));
        products.add(new Pasta(6,"Sea food",28));
        products.add(new Pasta(7,"Gnochi",29));
        products.add(new Pasta(8,"Quattro formaggi",30));

        products.add(new Meat(8,"Quattro formaggi",30));


        return products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public static void showAllMenu() {
        ArrayList<Product> products = Menu.setProducts();
        for (int i = 0; i < products.size(); i++) {
            System.out.print(products.get(i));
        }
    }
}
