package com.interfaceBasics.quest2;

public class ZipExtractor implements IExtractor{
    @Override
    public void extractFiles(String filename) {
        System.out.println("extracting from zip  =>files as .txt, as jpeg, as .doc files");
    }
}
