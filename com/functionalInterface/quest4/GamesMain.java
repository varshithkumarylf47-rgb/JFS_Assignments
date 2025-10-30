package com.functionalInterface.quest4;

import java.util.Scanner;

public class GamesMain {
    public static void main(String[] args) {
        IGames games;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Indoor Games\n2.Outdoor Games\nChoose any one of the games from above: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                games = () -> {
                    String[] indoorGames = {"Carrom", "Chess", "Table Tennis", "Badminton", "Ludo", "Snooker", "Cards"};
                    for (String game : indoorGames)
                        System.out.println(game);
                };
                games.showGames();
                break;
            case 2:
                games = () -> {
                    String[] outdoorGames = {"Cricket", "Football", "Hockey", "Basketball", "Volleyball", "Tennis", "Baseball"};
                    for (String game : outdoorGames)
                        System.out.println(game);
                };
                games.showGames();
                break;
            default:
                System.out.println("Invalid option " + option);

        }
    }
}
