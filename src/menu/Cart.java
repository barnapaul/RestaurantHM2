package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {

    ArrayList<Product> cartItems = new ArrayList<>();

    private final static int FOOD_VAT = 9;
    private final static int DESERT_VAT = 10;
    private final static int SODAS_VAT = 12;
    private final static int NATURAL_DRINKS_VAT = 5;

    public ArrayList<Product> getCartItems() {
        return cartItems;
    }

    public void addProductToCartByPID(int productId) {
        Product product = getProductByProductID(productId);
        chooseCookStyle(productId);
        if (product instanceof Drink) {
            ifChooseDrink(productId);
        } else {
            addToCart(product);
        }
    }

    public Product getProductByProductID(int pid) {
        Product product = null;
        List<Product> products = new Menu().getProducts();

        for (Product prod : products) {
            if (prod.getId() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }

    private void addToCart(Product product) {
        cartItems.add(product);
    }

    void printCartItems() {
        for (Product prod : cartItems) {
            System.out.println("\n\tProduct: " + prod.getName() + "\n\t\tPrice: " + prod.getPrice());
        }
    }

    public String getTotalPrice() {
        ArrayList<Product> cartItems = getCartItems();
        double totalPrice = 0;
        double VAT = 0;
        for (Product cartItem : cartItems) {
            if (cartItem instanceof Desert) {
                VAT = VAT + getVat(DESERT_VAT, cartItem.getPrice());
            } else if (cartItem instanceof Drink) {
                if (((Drink) cartItem).isHealthy()) {
                    VAT = VAT + getVat(NATURAL_DRINKS_VAT, cartItem.getPrice());
                } else {
                    VAT = VAT + getVat(SODAS_VAT, cartItem.getPrice());
                }
            } else {
                VAT = VAT + getVat(FOOD_VAT, cartItem.getPrice());
            }
            totalPrice = totalPrice + cartItem.getPrice();
        }

        return showTotalPriceAndVAT(totalPrice, VAT);
    }

    private double getVat(int percent, double price) {
        return percent / 100 + price;
    }

    private String showTotalPriceAndVAT(double totalPrice, double VAT) {
        return "The Total Price is " + totalPrice + " and the VAT is " + VAT + "\n";
    }

    private void chooseCookStyle(int productId) {
        ArrayList<Product> products = Menu.products;
        Product product = getProductByProductID(productId);
        Scanner in = new Scanner(System.in);
        if (product instanceof Meat) {

            System.out.print("Choose how you want your meat be cooked " + "\n");
            showCookedStyleInfo();
            int idCookStyle = Integer.parseInt(in.nextLine());
            if (idCookStyle == EnumsCookStyle.RARE.id) {
                ((Meat) product).setCookStyle(EnumsCookStyle.RARE.toString());
            } else if (idCookStyle == EnumsCookStyle.MEDIUM.id) {
                ((Meat) product).setCookStyle(EnumsCookStyle.MEDIUM.toString());
            } else if (idCookStyle == EnumsCookStyle.WELL_COOKED.id) {
                ((Meat) product).setCookStyle(EnumsCookStyle.WELL_COOKED.toString());
            }
            chooseDishSide(productId);
            System.out.print("Meat preparation style: " + ((Meat) product).getCookStyle());
            System.out.print("\n Your Dish Side is: " + products.get(((Meat) product).getIdSideDish()).getName());

        }

    }

    private void showCookedStyleInfo() {
        System.out.print("1. RARE" + "\n");
        System.out.print("2. MEDIUM" + "\n");
        System.out.print("3. WELL COOKED" + "\n");
    }

    private void chooseDishSide(int productId) {
        Product product = getProductByProductID(productId);

        System.out.print("Choose Dish Side ");
        showSideDish();


        Scanner inDish = new Scanner(System.in);

        if (product instanceof Meat) {
            ((Meat) product).setIdSideDish(Integer.parseInt(inDish.nextLine()));

        }
    }

    private void showSideDish() {
        ArrayList<Product> products = Menu.products;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) instanceof SideDish) {
                System.out.print("\n\t\t" + products.get(i).getId() + ". " + products.get(i).getName());
            }
        }
    }

    public void ifChooseDrink(int productId) {
        Product product = getProductByProductID(productId);
        if (product instanceof Drink) {
            if (((Drink) product).isInStock()) {
                addProductToCartByPID(productId);
            } else {
                System.out.println("Drink is not in stock");
            }
        }
    }
}
