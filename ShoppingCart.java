package Workshop7;

import java.util.HashMap;

public class ShoppingCart {
    HashMap<Product, Integer> cartItems = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        cartItems.put(product, quantity);
    }

    public void removeProduct(Product product) {
        cartItems.remove(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product p : cartItems.keySet()) {
            total += p.price * cartItems.get(p);
        }
        return total;
    }

    public void viewCartItems() {
        for (Product p : cartItems.keySet()) {
            System.out.println(p.name);
        }
    }
}
