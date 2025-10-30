package com.interfaceBasics.quest3;

import java.util.Scanner;

public class CompressorMain {
    public static void main(String[] args) {
        IFileCompressor compressor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zip (z)\nJar (j)\nRar (r)\nSelect an option: ");
        String option = scanner.next();
        switch (option.toLowerCase()) {
            case "z":
                compressor = new ZipCompressor();
                compressor.compressFile("file1.tmp", "y8f.d", "invoice_202.pdf", "image_12.png", "data_f8.csv");
                break;
            case "j":
                compressor = new JarCompressor();
                compressor.compressFile("file1.tmp", "y8f.d", "invoice_202.pdf", "image_12.png", "data_f8.csv");
                break;
            case "r":
                compressor = new RarCompressor();
                compressor.compressFile("file1.tmp", "y8f.d", "invoice_202.pdf", "image_12.png", "data_f8.csv");
                break;
            default:
                System.out.println("Enter valid option");
        }
    }
}
