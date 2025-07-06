package sprint1Tasca1_1_Nivell3_ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Editor> editors = new ArrayList<>();

    public static void main(String[] args) {

        int option;

        System.out.println("WELCOME TO THE MUNDO ANTIDEPORTIVO APP MENU.");

        do {
            System.out.println("\nWhat would you like to do? Select an option:\n");
            System.out.print(
                "1. Add editor\n" +
                "2. Remove editor\n" +
                "3. Add article to an editor\n" +
                "4. Remove article\n" +
                "5. Show all articles by editor\n" +
                "6. Calculate article price\n" +
                "7. Calculate article score\n" +
                "0. Exit program\n\n" +
                "Selected option: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: addEditor(); break;
                case 2: removeEditor(); break;
                case 3: addArticleToEditor(); break;
                case 4: removeArticle(); break;
                case 5: showEditorArticles(); break;
                case 6: calculateArticlePrice(); break;
                case 7: calculateArticleScore(); break;
                case 0:
                    System.out.println("You have exited the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a menu item.");
            }
        } while (option != 0);
    }

    public static Editor findEditor() {
        Scanner dniScanner = new Scanner(System.in);
        System.out.print("\nEnter the editor's ID: ");
        String editorId = dniScanner.nextLine().trim().toLowerCase();

        for (var editor : editors) {
            if (editorId.equalsIgnoreCase(editor.getId().toLowerCase())) {
                return editor;
            }
        }
        throw new IllegalArgumentException("The entered ID does not match any in the list.");
    }

    public static void addEditor() {
        Scanner editorScanner = new Scanner(System.in);
        System.out.print("\nEnter editor's name: ");
        String name = editorScanner.nextLine();
        System.out.print("Enter editor's ID: ");
        String id = editorScanner.nextLine().toUpperCase();

        Editor editor = new Editor(name, id);
        editors.add(editor);
        System.out.printf("Editor %s with ID %s has been added to the list.\n", editor.getName(), editor.getId());
    }

    public static void removeEditor() {
        Editor editor = findEditor();
        editors.remove(editor);
        System.out.printf("Editor %s with ID %s has been removed from the list.\n", editor.getName(), editor.getId());
    }

    public static void addArticleToEditor() {
        Scanner articleScanner = new Scanner(System.in);

        System.out.println("\nSelect the sport related to the article:");
        System.out.print(
            "1. Football" +
            "2. Basketball" +
            "3. Tennis" +
            "4. F1" +
            "5. Motorsports");
        int option = articleScanner.nextInt(); articleScanner.nextLine();

        System.out.print("\nEnter the article's headline: ");
        String headline = articleScanner.nextLine();

        Article article = null;
        if (option == 1) {
            System.out.print("\nEnter competition name: ");
            String competition = articleScanner.nextLine();
            System.out.print("Enter club name: ");
            String club = articleScanner.nextLine();
            System.out.print("Enter player name: ");
            String player = articleScanner.nextLine();
            article = new FootballArticle(headline, competition, club, player);
        }
        else if (option == 2) {
            System.out.print("\nEnter competition name: ");
            String competition = articleScanner.nextLine();
            System.out.print("Enter club name: ");
            String club = articleScanner.nextLine();
            article = new BasketballArticle(headline, competition, club);
        }
        else if (option == 3) {
            System.out.print("\nEnter competition name: ");
            String competition = articleScanner.nextLine();
            System.out.print("Enter player(s) name(s): ");
            String players = articleScanner.nextLine();
            article = new TennisArticle(headline, competition, players);
        }
        else if (option == 4) {
            System.out.print("\nEnter racing team name: ");
            String team = articleScanner.nextLine();
            article = new F1Article(headline, team);
        }
        else if (option == 5) {
            System.out.print("\nEnter racing team name: ");
            String team = articleScanner.nextLine();
            article = new MotorcyclingArticle(headline, team);
        }
        else {
            System.out.println("Invalid option.");
            return;
        }

        Editor editor = findEditor();
        editor.addArticle(article);
    }

    public static void removeArticle() {
        Scanner remScanner = new Scanner(System.in);
        System.out.print("Enter editor's name: ");
        String editorName = remScanner.nextLine();
        System.out.print("Enter the article's headline: ");
        String articleHeadline = remScanner.nextLine();

        for (var editor : editors) {
            if (editorName.equalsIgnoreCase(editor.getName())) {
                for (var article : editor.getArticles()) {
                    if (articleHeadline.equalsIgnoreCase(article.getHeadline())) {
                        editor.removeArticle(article);
                        return;
                    }
                }
                System.out.println("\nThe article is not in the editor's list.");
                return;
            }
        }
        System.out.println("\nEditor not found in the list.");
    }

    public static void showEditorArticles() {
        Editor editor = findEditor();
        List<Article> list = editor.getArticles();
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("\nThe list is empty.");
        }
    }

    public static int calculateArticlePrice() {
        Scanner priceScanner = new Scanner(System.in);
        System.out.print("Enter the article's headline: ");
        String headline = priceScanner.nextLine();

        int price = 0;
        for (var editor : editors) {
            for (var article : editor.getArticles()) {
                if (headline.equalsIgnoreCase(article.getHeadline())) {
                    price = article.calculatePrice();
                }
            }
        }
        return price;
    }

    public static int calculateArticleScore() {
        Scanner scoreScanner = new Scanner(System.in);
        System.out.print("Enter the article's headline: ");
        String headline = scoreScanner.nextLine();

        int score = 0;
        for (var editor : editors) {
            for (var article : editor.getArticles()) {
                if (headline.equalsIgnoreCase(article.getHeadline())) {
                    score = article.calculateScore();
                }
            }
        }
        return score;
    }
}