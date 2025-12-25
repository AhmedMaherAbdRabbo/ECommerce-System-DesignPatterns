/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author elmnshawy
 */
public class CustomerSession {
   
    private static CustomerSession instance;
    private Customer currentCustomer;

    private CustomerSession() {}

    public static CustomerSession getInstance() {
        if(instance == null) {
            instance = new CustomerSession();
        }
        return instance;
    }

    public void setCurrentCustomer(Customer customer) {
        this.currentCustomer = customer;
    }

    public Customer getCurrentCustomer() {
        return this.currentCustomer;
    }
}


