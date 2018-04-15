package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static final ArrayList<Product> products = new ArrayList<>();


    private static ArrayList<Product> setProducts() {

        products.add(new Pizza(1,"Capriciosa",20));
        products.add(new Pizza(2,"Quattro stagioni",21));
        products.add(new Pizza(3,"Margherita",22));
        products.add(new Pizza(4,"Prosciuto e funghi",23));

        products.add(new Pasta(5,"Carbonara",27));
        products.add(new Pasta(6,"Sea food",28));
        products.add(new Pasta(7,"Gnochi",29));
        products.add(new Pasta(8,"Quattro formaggi",30));

        products.add(new Meat(9,"Chicken",30));
        products.add(new Meat(10,"Duck",31));
        products.add(new Meat(11,"Hamburger",32));
        products.add(new Meat(12,"Steak",33));
        products.add(new Meat(13,"Pork chops",34));

        products.add(new SideDish(14,"French fries",15));
        products.add(new SideDish(15,"Rice",16));
        products.add(new SideDish(16,"Mashed potatoes",17));

        products.add(new SauceDressing(17,"Ketchup",5));
        products.add(new SauceDressing(18,"Mayo",5));
        products.add(new SauceDressing(19,"Tzatziki",7));

        products.add(new Desert(20,"Lava cake",20));
        products.add(new Desert(21,"Icecream",18));

        products.add(new Drink(21,"Water",10,500,true,10));
        products.add(new Drink(22,"Cola",12,250,false,1));
        products.add(new Drink(23,"Fanta",12,250,false,4));
        products.add(new Drink(24,"Lemonade",18,500,true,5));
        products.add(new Drink(25,"Fresh",18,250,true,6));

        return products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public static void showAllMenu() {
        ArrayList<Product> products = Menu.setProducts();
        for (Product product : products) {
            System.out.print(product);
        }
    }
}
