import java.util.ArrayList;
import java.util.List;

public class Cart {

    ArrayList<Product> cartItems = new ArrayList<>();

    final static int DESERT_VAT = 10;
    final static int FOOD_VAT = 9;




    public ArrayList<Product> getCartItems() {
        return cartItems;
    }

    public void addProductToCartByPID(int productId) {
        Product product = getProductByProductID(productId);
        addToCart(product);
    }

    private Product getProductByProductID(int pid) {
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
        for (Product prod: cartItems) {
            System.out.println(prod.getName() + " "  + prod.getPrice());
        }
    }

    public double getTotalPrice(){
        ArrayList<Product> cartItems = getCartItems();
        int totalPrice=0;
        double VAT =0;
        for(int i=0; i<cartItems.size(); i++){
            if (cartItems.get(i) instanceof Deserts) {
                VAT = VAT +  (cartItems.get(i).getPrice() * getVat(DESERT_VAT));
            } else {
                VAT = VAT +  (cartItems.get(i).getPrice() * getVat(FOOD_VAT));
            }
            totalPrice = totalPrice + cartItems.get(i).getPrice();
        }

        return totalPrice+VAT;
    }

    public double getVat(int percent){
        return percent /100;
    }
}
