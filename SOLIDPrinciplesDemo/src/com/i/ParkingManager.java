package com.i;

public interface ParkingManager {
    void parkCar();   // Decrease empty spot count by 1
    void unparkCar(); // Increase empty spot count by 1
    int getCapacity(); // Returns parking capacity
}