package sprint1Tasca1_1_Nivell3_ex1;

import java.util.ArrayList;
import java.util.List;

/** Represents an Editor who can have articles assigned */
public class Editor {

    private String name;
    private final String id;
    private static double salary;
    private ArrayList<Article> articles;

    public Editor(String name, String id) {
        this.name = name;
        this.id = id;
        this.articles = new ArrayList<>();
    }

    /** @return the editor’s name */
    public String getName() {
        return name;
    }

    /** @return the editor’s ID (e.g. DNI) */
    public String getId() {
        return id;
    }

    /** @return the current salary shared by all editors */
    public static double getSalary() {
        return salary;
    }

    /**
     * Updates the salary for all editors
     * @param newSalary the new salary
     */
    public static void setSalary(double newSalary) {
        salary = newSalary;
    }

    /** Adds an article to this editor */
    public void addArticle(Article article) {
        articles.add(article);
    }

    /** Removes an article from this editor */
    public void removeArticle(Article article) {
        articles.remove(article);
    }

    /**
     * Returns a read‑only list of the editor’s articles
     * @return unmodifiable list of articles
     */
    public List<Article> getArticles() {
        return List.copyOf(articles);
    }

    @Override
    public String toString() {
        return "Editor {name: " + name +
               ", id: " + id +
               ", salary: " + salary +
               ", assigned articles: " + articles + "}\n";
    }
}