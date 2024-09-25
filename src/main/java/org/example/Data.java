package org.example;

import java.util.ArrayList;

public class Data {
    public static ArrayList<Game> games;

    static {
        games = new ArrayList<>();

        games.add(new Game("The Legend of Zelda: Breath of the Wild", "Nintendo Switch", 2017));
        games.add(new Game("God of War", "PlayStation 4", 2018));
        games.add(new Game("Red Dead Redemption 2", "Xbox One", 2018));
        games.add(new Game("Cyberpunk 2077", "PC", 2020));
        games.add(new Game("The Witcher 3: Wild Hunt", "PC", 2015));
        games.add(new Game("Super Mario Odyssey", "Nintendo Switch", 2017));
        games.add(new Game("Horizon Zero Dawn", "PlayStation 4", 2017));
        games.add(new Game("Minecraft", "PC", 2011));
        games.add(new Game("Fortnite", "PC", 2017));
        games.add(new Game("Call of Duty: Modern Warfare", "PlayStation 4", 2019));
    }
}
