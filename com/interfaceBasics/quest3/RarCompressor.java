package com.interfaceBasics.quest3;


public class RarCompressor implements IFileCompressor  {

    @Override
    public void compressFile(String... files) {
        System.out.println("Processing....");
        for(String file: files)
            System.out.println(file);
        System.out.println("Compressed as rar file");
    }
}
