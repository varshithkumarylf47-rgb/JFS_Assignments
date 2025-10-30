package com.interfaceBasics.quest2;

import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        IExtractor extractor;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zip (z)\nJar (j)\nRar (r)\nSelect an option: ");
        String option = scanner.next();
        switch(option.toLowerCase()){
            case "z":
                extractor = new ZipExtractor();
                extractor.extractFiles("examples.zip");
                break;
            case "j":
                extractor = new JarExtractor ();
                extractor.extractFiles("examples.jar");
                break;
            case "r":
                extractor = new RarExtractor();
                extractor.extractFiles("examples.rar");
                break;
            default:
                System.out.println("Enter valid option");
        }
    }
}
