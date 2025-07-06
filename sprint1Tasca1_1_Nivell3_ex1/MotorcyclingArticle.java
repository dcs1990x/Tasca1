package sprint1Tasca1_1_Nivell3_ex1;

import lombok.Getter;

public class MotorcyclingArticle extends Article {

    @Getter private String team;

    public MotorcyclingArticle(String headline, String team) {
        super(headline);
        this.team = team;
    }

    @Override
    public int calculatePrice() {
        final int BASE_PRICE = 100;
        int totalPrice = BASE_PRICE;

        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            totalPrice += 50;
        }
        return totalPrice;
    }

    @Override
    public int calculateScore() {
        final int BASE_SCORE = 3;
        int totalScore = BASE_SCORE;

        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            totalScore += 3;
        }
        return totalScore;
    }

    @Override
    public String toString() {
        return "\n\tMotorcycling {" + super.toString() + ", Team: " + this.team + "}";
    }
}