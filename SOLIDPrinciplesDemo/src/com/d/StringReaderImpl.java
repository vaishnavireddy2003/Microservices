package com.d;

public class StringReaderImpl implements ReaderInterface {
    private final String data;

    public StringReaderImpl(String data) {
        this.data = data;
    }

    @Override
    public String read() {
        return data;
    }
}
