package com.codeclan.rockpaperscissors;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RockPaperScissors {
    EnumThing rockpaperscissors;
    HashMap<String, Integer> stats;

    public RockPaperScissors() {
        this.rockpaperscissors = rockpaperscissors;
        this.stats = new HashMap<String, Integer>();
        stats.put("User", 0);
        stats.put("Computer", 0);
        stats.put("Draws", 0);
        stats.put("Paper", 0);
        stats.put("Rock", 0);
        stats.put("Scissors", 0);
    }

    public EnumThing computerChoice() {
        Random rand = new Random();
        int n = rand.nextInt(3);
        switch (n) {
            case 0:
                return EnumThing.PAPER;
            case 1:
                return EnumThing.ROCK;
            case 2:
                return EnumThing.SCISSORS;
        }
        return null;
    }

    public String winOrLose(EnumThing rockpaperscissors) {
        Integer resultnum = 0;
        if (rockpaperscissors == computerChoice()) {
            stats.put("Draws", stats.get("Draws") + 1);
            return "It's a draw";
        }
//        if (rockpaperscissors==EnumThing.PAPER)
//        {return computerChoice()==EnumThing.SCISSORS ? "Computer wins (Scissors cut Paper)" : "Well done! you won (Paper covers Rock)";
//        }
//        else if (rockpaperscissors==EnumThing.ROCK)
//        { return computerChoice()==EnumThing.PAPER ? "Computer wins (Papers covers rock)" : "Well done! you won (Rock blunts Scissors)";
//        }
//        else if (rockpaperscissors==EnumThing.SCISSORS)
//        { return computerChoice()==EnumThing.ROCK ? "Computer wins (Rock blunts Scissors)" : "Well done! you won (Scissors cut Paper)";
//        }
        if (rockpaperscissors == EnumThing.PAPER) {
            resultnum = computerChoice() == EnumThing.SCISSORS ? 1 : 2;
        } else if (rockpaperscissors == EnumThing.ROCK) {
            resultnum = computerChoice() == EnumThing.PAPER ? 3 : 4;
        } else if (rockpaperscissors == EnumThing.SCISSORS) {
            resultnum = computerChoice() == EnumThing.ROCK ? 5 : 6;
        }
        switch (resultnum) {
            case 1:
                stats.put("Computer", stats.get("Computer") + 1);
                stats.put("Scissors", stats.get("Scissors") + 1);
                return "Computer wins (Scissors cut Paper)";

            case 2:
                stats.put("User", stats.get("User") + 1);
                stats.put("Paper", stats.get("Paper") + 1);
                return "Well done! you won (Paper covers Rock)";

            case 3:
                stats.put("Computer", stats.get("Computer") + 1);
                stats.put("Paper", stats.get("Paper") + 1);
                return "Computer wins (Paper covers rock)";

            case 4:
                stats.put("User", stats.get("User") + 1);
                stats.put("Rock", stats.get("Rock") + 1);
                return "Well done! you won (Rock blunts Scissors)";

            case 5:
                stats.put("Computer", stats.get("Computer") + 1);
                stats.put("Rock", stats.get("Rock") + 1);
                return "Computer wins (Rock blunts Scissors)";

            case 6:
                stats.put("User", stats.get("User") + 1);
                stats.put("Scissors", stats.get("Scissors") + 1);
                return "Well done! you won (Scissors cut Paper)";
        }
        return null;
    }

    public String output(){
        String result = null;
        for (Map.Entry<String, Integer> entry: stats.entrySet()){
            result = entry.getKey() + ": " + entry.getValue() + ",\n";
        }
        return result;
    }
}


