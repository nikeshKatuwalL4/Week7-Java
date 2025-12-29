package Workshop7;

public class Customer {
    int customerId;
    String name;
    String email;
    String password;

    public void register() {
        System.out.println("Registered");
    }

    public void login() {
        System.out.println("Logged in");
    }

    public void viewProducts() {
        System.out.println("Viewing products");
    }

    public void addToCart() {
        System.out.println("Added to cart");
    }

    public void checkout() {
        System.out.println("Checkout completed");
    }
}

