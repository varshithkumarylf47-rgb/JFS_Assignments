package com.interfaceBasics.quest3;


public class ZipCompressor implements IFileCompressor {

    @Override
    public void compressFile(String... files) {
        System.out.println("Processing.....");
        for (String file : files)
            System.out.println(file);
        System.out.println("Compressed as zip file");
    }
}
