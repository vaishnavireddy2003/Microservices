package com.i;

public class Sedan implements Car {
    private String model;

    public Sedan(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}