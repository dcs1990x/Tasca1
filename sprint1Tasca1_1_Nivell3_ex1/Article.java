package sprint1Tasca1_1_Nivell3_ex1;

import lombok.Getter;

public abstract class Article {

    @Getter private String headline;
    @Getter private String content;
    @Getter private int score;
    @Getter private int price;

    public Article(String headline) {
        this.headline = headline;
        this.content = "";
    }

    public abstract int calculatePrice();

    public abstract int calculateScore();

    @Override
    public String toString() {
        return "Headline: " + this.headline + ", Content: " + this.content
               + ", Score: " + this.calculateScore() + ", Price: " + this.calculatePrice() + "€";
    }
}