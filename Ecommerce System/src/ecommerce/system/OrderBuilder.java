/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author DELL
 */
public class OrderBuilder {
    
    private Customer customer;
    private String deliveryType;      
    private String paymentMethod;     
    private String shippingAddress;
    private String orderStatus;  
    

    public OrderBuilder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }

    public OrderBuilder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public OrderBuilder setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    
    public Order build() {
        return new Order(customer, deliveryType, paymentMethod, shippingAddress);
    }
}

    

