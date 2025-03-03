package com.d;

public class StringProcessor {
    private final ReaderInterface reader;
    private final WriterInterface writer;

    public StringProcessor(ReaderInterface reader, WriterInterface writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void printString() {
        writer.write(reader.read());
    }
}