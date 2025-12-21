
package ecommerce.system;

import java.util.ArrayList;
import java.util.List;

public class CartManager {
    
    private static CartManager instance;


    private List<CartItem> cartItems;

   
    private CartManager() {
        cartItems = new ArrayList<>();
    }

    
    public static CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    
    public void addItem(Product product, int quantity) {
        cartItems.add(new CartItem(product, quantity));
    }

    
    public void removeItem(int productName) {
        for (CartItem item : cartItems) {
        if (item.getProduct().getName().equals(productName)) {
            cartItems.remove(item);
            break; 
        }
    }
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    
    public void clearCart() {
        cartItems.clear();
    }

    
    public double calculateTotal() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
