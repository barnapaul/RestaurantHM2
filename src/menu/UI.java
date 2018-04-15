package menu;

import java.util.Scanner;

public class UI {
    Cart cart = new Cart();

    private int ch = 0;

    public UI() {
        menu();
    }


    public void startScreen() {
        System.out.println("1. Display Store Products");
        System.out.println("2. Display Cart");
        System.out.println("3. Display Cart Price");
        System.out.println("0. Exit");
    }

    public void menu() {
        do {
            startScreen();
            getUserInput();

            switch (ch) {
                case 1:
                    Menu.showAllMenu();
//                    storeProductsMenu();
                    System.out.print("Choose item: " + "\n");
                    chooseItem();
                    break;
                case 2:
                    if (cart.cartItems == null) {
                        System.out.print("Cart is empty");
                    } else {
                        showCart();
                    }
                    break;
                case 3 :
                    System.out.print(cart.getTotalPrice());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (ch != 0);
    }

    private void chooseItem() {

        addProductToCart();
        showCart();

    }

    private int getUserInput() throws NumberFormatException {
        Scanner in = new Scanner(System.in);
//        if (!in.nextLine().equals(""))
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }


    private void addProductToCart() {
        int pid = getUserInput();
        cart.addProductToCartByPID(pid);
    }

    private void showCart() {
        cart.printCartItems();
        cart.getTotalPrice();
    }

}
