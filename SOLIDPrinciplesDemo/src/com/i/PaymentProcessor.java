package com.i;

public interface PaymentProcessor {
    double calculateFee(Car car); // Calculates fee based on hours
    void doPayment(Car car) throws Exception; // Process payment
}