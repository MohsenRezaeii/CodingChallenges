package com.mohsen.codingchallenges;

public class TotalPoints {
    public static int points(String[] games) {
        int ourScore = 0;
        for (String game : games) {
            char ourTeamScore = game.charAt(0);
            char opponentScore = game.charAt(2);

            if (ourTeamScore > opponentScore) {
                ourScore += 3;
            } else if (ourTeamScore == opponentScore) {
                ourScore++;
            }
        }
        return ourScore;
    }
}
