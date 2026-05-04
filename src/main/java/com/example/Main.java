package com.example;

//GSON objekt som vi behöver
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
// Importera Type för att hjälpa json att omvandla data
import java.lang.reflect.Type;
//UniREST objekt som vi behöver
import kong.unirest.Unirest;
import kong.unirest.HttpResponse;
import kong.unirest.UnirestException;
// Importera Fil hantering
import java.nio.file.*;
import java.io.IOException;
// ArrayList för att lagra objekt
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static String baseUrl = "http://10.151.168.5:3118";
    private static Gson gson = new Gson(); // att översätta data
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Magazine> magazines = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Libarysystem Meny ---");
            System.out.println("1. Hämta böcker");
            System.out.println("2. Hämta tidningar");
            System.out.println("3. Skriva ut hämtade böcker");
            System.out.println("4. Skriva ut hämtade magazines");
            System.out.println("5. Lägg till bok");
            System.out.println("6. Lägg till tidning");
            System.out.println("7. Avsluta");
            System.out.println("Skriv 1-6 för alternativ:");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    fetchBooks();
                    break;
                case "2":
                    fetchMagazines();
                    break;
                case "3":
                    displayBooks();
                    break;
                case "4":
                    displayMagazines();
                    break;
                case "5":
                    addNewBook();
                    break;
                case "6":
                    addNewMagazine();
                    break;
                case "7":
                    running = false;
                    System.out.println("Avslutar programmet");
                    break;
                default:
                    System.out.println("Ogiltigt val försök igen dumhuve.");
                    break;
            }
        }
    }

    private static void fetchBooks() {
        HttpResponse<String> response = Unirest.get(baseUrl + "/books").asString();

        Type bookListType = new TypeToken<ArrayList<Book>>() {
        }.getType();
        books = gson.fromJson(response.getBody(), bookListType);

        System.out.println("\nAlla böcker från servern");

        if (books.isEmpty()) {
            System.out.println("Inga böcker hittades på servern.");
        } else {
            for (Book b : books) {
                System.out
                        .println("ID: " + b.getId() + " | Titel: " + b.getTitle() + " | Författare: " + b.getAuthor());
            }
        }
    }

    private static void fetchMagazines() {
        HttpResponse<String> response = Unirest.get(baseUrl + "/magazines").asString();

        Type magListType = new TypeToken<ArrayList<Magazine>>() {
        }.getType();
        magazines = gson.fromJson(response.getBody(), magListType);

        System.out.println("\nAlla tidningar från servern");

        if (magazines.isEmpty()) {
            System.out.println("Inga tidningar hittades på servern.");
        } else {
            for (Magazine m : magazines) {
                System.out.println("ID: " + m.getId() + " | Titel: " + m.getTitle() + " | Nr: " + m.getIssueNumber());
            }
        }
    }

    private static void displayBooks() {
        System.out.println("\nBöcker");
        for (Book b : books)
            System.out.println(b.getTitle());
    }

    private static void displayMagazines() {

        System.out.println("\nTidingiar");
        for (Magazine m : magazines)
            System.out.println(m.getTitle());
    }

    private static void addNewBook() {
        System.out.print("Titel: ");
        String t = scanner.nextLine();
        System.out.print("Författare: ");
        String a = scanner.nextLine();
        System.out.print("genre: ");
        String g = scanner.nextLine();
        System.out.print("sidor: ");
        int p = Integer.parseInt(scanner.nextLine());

        String id = String.valueOf(books.size() + 1);

        books.add(new Book(id, t, a, g, p, true));
    }

    private static void addNewMagazine() {
        System.out.print("Titel: ");
        String t = scanner.nextLine();
        System.out.print("Nummer: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("Kategori: ");
        String c = scanner.nextLine();
        System.out.print("År: ");
        int y = Integer.parseInt(scanner.nextLine());

        String id = String.valueOf(magazines.size() + 1);

        magazines.add(new Magazine(id, t, n, c, y, true));

    }
}