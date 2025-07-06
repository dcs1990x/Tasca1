package sprint1Tasca1_1_Nivell3_ex1;

import lombok.Getter;

public class FootballArticle extends Article {

    @Getter private String competition;
    @Getter private String club;
    @Getter private String player;

    public FootballArticle(String headline, String competition, String club, String player) {
        super(headline);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    @Override
    public int calculatePrice() {
        final int BASE_PRICE = 300;
        int totalPrice = BASE_PRICE;

        if (this.competition.equalsIgnoreCase("Champions League")) {
            totalPrice += 100;
        }
        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
            totalPrice += 100;
        }
        if (this.player.equalsIgnoreCase("Ferran Torres") || this.player.equalsIgnoreCase("Benzema")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        final int BASE_SCORE = 5;
        int totalScore = BASE_SCORE;

        if (this.competition.equalsIgnoreCase("Champions League")) {
            totalScore += 3;
        }
        else if (this.competition.equalsIgnoreCase("Lliga")) {
            totalScore += 2;
        }
        if (this.club.equalsIgnoreCase("Barça") || this.club.equalsIgnoreCase("Madrid")) {
            totalScore += 1;
        }
        if (this.player.equalsIgnoreCase("Ferran Torres") || this.player.equalsIgnoreCase("Benzema")) {
            totalScore += 1;
        }
        return totalScore;
    }

    @Override
    public String toString() {
        return "\n\tFootball {" + super.toString()
               + ", Competition: " + this.competition + ", Club: " + this.club + ", Player: "
               + this.player + "}";
    }
}