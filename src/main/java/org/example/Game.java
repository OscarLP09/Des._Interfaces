package org.example;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Game {
    private String title;
    private String platform;
    private int year;


}
