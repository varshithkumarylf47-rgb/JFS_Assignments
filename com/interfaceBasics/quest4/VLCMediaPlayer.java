package com.interfaceBasics.quest4;

public class VLCMediaPlayer implements IMediaPlayer{
    @Override
    public void playMusic() {
        System.out.println("play mkv files");
    }

    @Override
    public void downloadMusic() {
        System.out.println("download files as mp3 ");
    }
}
