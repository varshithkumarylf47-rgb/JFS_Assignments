package com.interfaceBasics.quest2;

public class JarExtractor implements IExtractor {
    @Override
    public void extractFiles(String filename) {
        System.out.println("extracting from jar=> files as .class files");
    }
}
