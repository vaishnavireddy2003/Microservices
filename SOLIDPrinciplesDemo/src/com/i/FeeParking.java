package com.i;

public class FeeParking implements ParkingManager, PaymentProcessor {
    private int capacity = 100; // Example capacity

    @Override
    public void parkCar() {
        if (capacity > 0) {
            capacity--;
            System.out.println("Car parked. Remaining spots: " + capacity);
        } else {
            System.out.println("No parking spots available.");
        }
    }

    @Override
    public void unparkCar() {
        capacity++;
        System.out.println("Car unparked. Remaining spots: " + capacity);
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public double calculateFee(Car car) {
        return 20.0; // Assume a fixed fee per hour
    }

    @Override
    public void doPayment(Car car) throws Exception {
        System.out.println("Payment successful: $" + calculateFee(car));
    }
}