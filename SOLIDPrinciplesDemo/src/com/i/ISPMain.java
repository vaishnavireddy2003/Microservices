package com.i;

public class ISPMain {
    public static void main(String[] args) {
        Car myCar = new Sedan("Toyota Camry");

        ParkingManager feeParking = new FeeParking();
        feeParking.parkCar();
        feeParking.unparkCar();

        PaymentProcessor feePayment = new FeeParking();
        try {
            feePayment.doPayment(myCar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        ParkingManager freeParking = new FreeParking();
        freeParking.parkCar();
        freeParking.unparkCar();
    }
}