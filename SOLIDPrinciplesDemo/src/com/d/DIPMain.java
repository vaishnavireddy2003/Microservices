package com.d;

public class DIPMain {
    public static void main(String[] args) {
       
        ReaderInterface reader = new StringReaderImpl("Hello, Dependency Inversion!");
        WriterInterface writer = new StringWriterImpl();

        StringProcessor processor = new StringProcessor(reader, writer);
        processor.printString();
    }
}