/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author DELL
 */
public class PaymentGateway {
    private static PaymentGateway instance;

    private PaymentGateway() {
        
    }

    public static PaymentGateway getInstance() {
        if (instance == null) {
            instance = new PaymentGateway();
        }
        return instance;
    }

    public boolean processCreditCard(String cardNumber, double amount) {
        return validatePayment(amount);
    }

    public boolean processPayPal(String email, double amount) {
        return validatePayment(amount);
    }

    private boolean validatePayment(double amount) {
        return amount > 0;
    }
    
}
