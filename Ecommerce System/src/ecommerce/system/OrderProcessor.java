/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author DELL
 */

import ecommerce.system.Order;

public interface OrderProcessor {
    
    void processOrder(Order order);
    double calculateShippingCost(Order order);
    String getEstimatedDelivery();
    
}
