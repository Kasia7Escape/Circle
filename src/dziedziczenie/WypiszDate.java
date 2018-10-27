package dziedziczenie;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WypiszDate {

    public static void main(String[] args) {

        System.out.println(printDateTime("2018.04.01"));
    }

    public static String printDateTime(String givenDate) {
        DateTimeFormatter givenFormatter = DateTimeFormatter.ofPattern("yyy.MM.dd");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy hh:mm:ss");

        LocalDate givenDateObject = LocalDate.parse(givenDate, givenFormatter);
        return givenDateObject.format(formatter);


        // String formattedDate = date.format();
    }
}