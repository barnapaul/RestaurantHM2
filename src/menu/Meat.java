package menu;

public class Meat extends Product {

    private String cookStyle;

    public int getIdSideDish() {
        return idSideDish;
    }

    public void setIdSideDish(int idSideDish) {
        this.idSideDish = idSideDish;
    }

    private int idSideDish;

    public String getCookStyle() {
        return cookStyle;
    }

    public void setCookStyle(String cookStyle) {
        this.cookStyle = cookStyle;
    }

    public Meat(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public String toString() {
        return getId() + ". Meat:  " + getName() + "\n\t\tPrice:  " + getPrice() + "\n";
    }




}
