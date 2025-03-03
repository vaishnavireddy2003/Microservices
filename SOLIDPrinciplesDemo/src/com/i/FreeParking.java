package com.i;

public class FreeParking implements ParkingManager {
    private int capacity = 50; // Example capacity

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
}
    