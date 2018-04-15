package menu;

public class Drink extends Product {

    private int drinkCapacity;
    private boolean isHealthy;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    private int stock;

    public boolean isHealthy() {
        return isHealthy;
    }

    public Drink(int id, String name, int price, int drinkCapacity, boolean isHealthy, int isInStock) {
        super(id, name, price);
        this.drinkCapacity = drinkCapacity;
        this.isHealthy = isHealthy;
        this.stock = isInStock;
    }
    public boolean isInStock(){
        if(stock <= 0){
            return false;
        }else {
            stock = stock - 1;
            return true;
        }
    }

    @Override
    public String toString() {
        return getId() + ". Drink: " + getName() + "\n\t\tCapacity: " + drinkCapacity +
                "\n\t\t\tPrice: " + getPrice() + "\n\t\t\t\t Stock: " + stock + "\n";
    }

}
