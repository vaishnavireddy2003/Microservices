package com.d;

public class StringWriterImpl implements WriterInterface {
    @Override
    public void write(String data) {
        System.out.println("Writing Data: " + data);
    }
}