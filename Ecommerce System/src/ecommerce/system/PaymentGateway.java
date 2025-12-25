/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.system;

/**
 *
 * @author DELL
 */
public class PaymentGateway implements PaymentService{
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

    @Override
    public boolean pay(String type, String reference, double amount) {
        
    if ("credit".equalsIgnoreCase(type)) {
            return processCreditCard(reference, amount);
        }

        if ("paypal".equalsIgnoreCase(type)) {
            return processPayPal(reference, amount);
        }

        return false;
    }
    
}
