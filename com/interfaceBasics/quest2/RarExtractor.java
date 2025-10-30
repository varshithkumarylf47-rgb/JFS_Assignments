package com.interfaceBasics.quest2;

public class RarExtractor implements IExtractor {
    @Override
    public void extractFiles(String filename) {
        System.out.println("extracting from rar=> files as .txt files from linux os");
    }
}
