package sprint1Tasca1_1_Nivell3_ex1;

import lombok.Getter;

public class TennisArticle extends Article {

    @Getter private String competition;
    @Getter private String tennisPlayer;

    public TennisArticle(String headline, String competition, String tennisPlayer) {
        super(headline);
        this.competition = competition;
        this.tennisPlayer = tennisPlayer;
    }

    @Override
    public int calculatePrice() {
        final int BASE_PRICE = 150;
        int totalPrice = BASE_PRICE;

        if (this.tennisPlayer.equalsIgnoreCase("Federer") ||
            this.tennisPlayer.equalsIgnoreCase("Nadal") ||
            this.tennisPlayer.equalsIgnoreCase("Djokovic")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        final int BASE_SCORE = 4;
        int totalScore = BASE_SCORE;

        if (this.tennisPlayer.equalsIgnoreCase("Federer") ||
            this.tennisPlayer.equalsIgnoreCase("Nadal") ||
            this.tennisPlayer.equalsIgnoreCase("Djokovic")) {
            totalScore += 3;
        }
        return totalScore;
    }

    @Override
    public String toString() {
        return "\n\tTennis {" + super.toString()
               + ", Competition: " + this.competition + ", Tennis Player: " + this.tennisPlayer + "}";
    }
}