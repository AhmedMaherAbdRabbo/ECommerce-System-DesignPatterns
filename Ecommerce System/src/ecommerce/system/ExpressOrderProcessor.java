/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author DELL
 */

import ecommerce.system.Order;

public class ExpressOrderProcessor implements OrderProcessor{
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing EXPRESS Order");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Shipping to: " + order.getShippingAddress());
        order.setOrderStatus("Processing - Express");
    }
    
    @Override
    public double calculateShippingCost(Order order) {
        return 150.0;
    }
    
    @Override
    public String getEstimatedDelivery() {
        return "1-2 Business Days";
    }
}
