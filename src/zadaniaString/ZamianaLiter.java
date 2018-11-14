package zadaniaString;

import java.util.Scanner;

//przechodzimy przez wyrazy sprawdzamy wielkosc liter i zamieniamy
public class ZamianaLiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst a zmienie wielkosc jego liter");
        //pobieramy tekst od usera
        String text = scanner.nextLine();
        System.out.println("------MENU------");

        System.out.println("1. zamien wszystkie litery na duże");
        System.out.println("2. zamien wszystkie litery na małe");
        System.out.println("3. zamien wszystkie litery małe na duże i duże na małe");
        System.out.println(" Wybierz numer opcji");
        int wybor = scanner.nextInt();

        switch (wybor) {
            case 1: {
                //przechodzimy przez cały napis

                for (int i = 0; i < text.length(); i++) {
                    //pobieramy znak na i-tej pozycji
                    char znak = text.charAt(i);
                    //rozpoznajemy czy to mala litera czy duza (zakres 90-122)
                    //jesli mała - robimy, jak duza - nie robimy nic
                    if (znak >= 97 && znak <= 122) {
                        //jezeli true -> to mamy mala litere
                        //aby uzyskac duza = musimy odjac 32 - patrz tablica ASCII
                        znak -= 32;
                    }
                    System.out.print(znak);
                }
                break;
            }

            case 2:
                for (int i = 0; i < text.length(); i++) {
                    char znak = text.charAt(i);
                    if (znak >= 65 && znak <= 90) {
                        znak += 32;
                    }
                    System.out.print(znak);
                }
                break;

            case 3:
                for (int i = 0; i < text.length(); i++) {
                    char znak = text.charAt(i);
                    if (znak >= 97 && znak <= 122) {
                        znak -= 32;
                    } else if (znak >= 65 && znak <= 90) {
                        znak += 32;
                    }
                    System.out.print(znak);
                }
                break;

            default:
                System.out.println("zły wybór");
        }
    }
}

