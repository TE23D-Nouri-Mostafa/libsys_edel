package com.example;
import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Magazine> magazines = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean running =true;

        while (running = true){ 
            System.out.println("\n--- Libarysystem Meny ---");
            System.out.println("1. Hämta böcker");
            System.out.println("2. Hämta tidningar");
            System.out.println("3. Skriva ut hämtade böcker");
            System.out.println("4. Skriva ut hämtade magazines");
            System.out.println("5. Lägg till bok");
            System.out.println("6. Lägg till tidning");
            System.out.println("7. Avsluta");
            System.out.println("Skriv 1-6 för alternativ:")

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
private static void fetchData(String type) {
        
    }
}