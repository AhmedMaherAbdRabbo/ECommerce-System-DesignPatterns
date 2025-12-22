
package ecommerce.system;

import java.util.ArrayList;
import java.util.List;

public class CartManager {
    
    private static CartManager instance;


    private List<CartItem> cartItems; 
    private List<CartObserver> observers ; 
    

   
    private CartManager() {
        cartItems = new ArrayList<>();
        observers = new ArrayList<>();
    }

    
    public static CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    
    public void addItem(Product product, int quantity) {
        cartItems.add(new CartItem(product, quantity));
        notifyObservers();
    }

    
    public void removeItem(String productName) {
        for (CartItem item : cartItems) {
            if (item.getProduct().getName().equals(productName)) {
                cartItems.remove(item);
                break; 
            }
        }
        notifyObservers();
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    
    public void clearCart() {
        cartItems.clear();
        notifyObservers();
    }

    
    public double calculateTotal() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getTotalPrice();
        }
        return total;
    }
    
    public void updateQuantity(Product product, int newQty) {
        for (CartItem item : cartItems){ 
          if (item.getProduct().equals(product)){
              item.setQuantity(newQty);
              break; 
            }
        } 
        notifyObservers(); 
    
    }
    
    public void addObserver(CartObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(CartObserver observer) {
        observers.remove(observer);
    }
    
    
    private void notifyObservers() {
        double total = calculateTotal();
        for (CartObserver cart_observer : observers) {
            cart_observer.update(cartItems, total);
        }
    }
    
    
    
}
