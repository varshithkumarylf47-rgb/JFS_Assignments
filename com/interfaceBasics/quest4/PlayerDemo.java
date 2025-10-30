package com.interfaceBasics.quest4;

import java.util.Scanner;

public class PlayerDemo {
    public static void main(String[] args) {
        IMediaPlayer player;
        Scanner scanner = new Scanner(System.in);
        System.out.print("VLC Media Player (VLC)\nWindows Media Player (W)\nSelect an option: ");
        String option = scanner.next();
        switch (option.toLowerCase()) {
            case "vlc":
                player = new VLCMediaPlayer();
                player.playMusic();
                player.downloadMusic();
                break;
            case "w":
                player = new WindowsMediaPlayer11();
                player.playMusic();
                player.downloadMusic();
                break;
            default:
                System.out.println("Enter valid option");
        }
    }
}
