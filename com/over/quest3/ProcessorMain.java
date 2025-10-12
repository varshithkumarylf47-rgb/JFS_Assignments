package com.over.quest3;

public class ProcessorMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.calculate(3);
        processor.calculate(36.0);
        processor.calculate(3.0,3);
        processor.calculate(9.0,5.0);
        processor.calculate(5,8);

    }
}
