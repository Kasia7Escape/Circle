package zadaniaString;

import java.util.Scanner;

public class Palindrom {

    public static boolean isPalindrome(String textToRevert) {

        //boolean result = true;
        StringBuilder builder = new StringBuilder();
        for (int i = textToRevert.length() - 1; i >= 0; i--) {
            builder.append(textToRevert.charAt(i));//buduje w pamieci wynikowy zapis - od tyłu
            if (builder.toString().equals(textToRevert)) {
                System.out.println("to jest palindrom");
                return true;
            }
        }
        System.out.println("to  nie jest palindrom");
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Podaj dowolny wyraz:");
        Scanner scanner = new Scanner(System.in);
        String wyraz = scanner.nextLine();

        isPalindrome(wyraz);

    }
}
