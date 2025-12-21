/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author DELL
 */
public class Order {
    private Customer customer;
    private String deliveryType;      // "Standard" or "Express"
    private String paymentMethod;     // "Credit Card", "PayPal", "Debit Card"
    private String shippingAddress;
    private String orderStatus;       // "Pending", "Processing", "Shipped", "Delivered"
    
    public Order(Customer customer, String deliveryType, 
                 String paymentMethod, String shippingAddress) {
        this.customer = customer;
        this.deliveryType = deliveryType;
        this.paymentMethod = paymentMethod;
        this.shippingAddress = shippingAddress;
        this.orderStatus = "Pending";
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public String getDeliveryType() {
        return deliveryType;
    }
    
    public String getPaymentMethod() {
        return paymentMethod;
    }
    
    public String getShippingAddress() {
        return shippingAddress;
    }
    
    public String getOrderStatus() {
        return orderStatus;
    }
    
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
    
    
}
