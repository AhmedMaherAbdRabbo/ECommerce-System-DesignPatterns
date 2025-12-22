
package ecommerce.system;

import java.util.List;

public interface CartObserver {
   
    public abstract void update(List<CartItem> items, double total);
}
