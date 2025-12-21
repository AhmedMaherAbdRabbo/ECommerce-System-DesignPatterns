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

public class StandardOrderProcessor implements OrderProcessor{
    @Override
    public void processOrder(Order order) {
        System.out.println("Processing Standard Order");
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Shipping to: " + order.getShippingAddress());
        order.setOrderStatus("Processing");
    }
    
    @Override
    public double calculateShippingCost(Order order) {
        return 50.0;
    }
    
    @Override
    public String getEstimatedDelivery() {
        return "5-7 Business Days";
    }
}
