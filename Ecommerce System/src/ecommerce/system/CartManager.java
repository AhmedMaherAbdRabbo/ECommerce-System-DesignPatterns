/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author DELL
 */
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

    
    public void removeItem(int productId) {
        cartItems.removeIf(
            item -> item.getProduct().getProductId() == productId
        );
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
