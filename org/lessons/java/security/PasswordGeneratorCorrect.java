import java.util.Scanner;

public class PasswordGeneratorCorrect {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Buongiorno! Oggi tramite il terminale, potrai generare una password dando alcuni dei tuoi dati! Partiamo subito, scrivimi il tuo nome.");

    String name = input.nextLine( );

    System.out.println("Perfetto!! Ora mi dici il tuo congome?");

    String surname = input.nextLine( );

    System.out.println("Perfetto!! Ora, hai un colore preferito? Scrivimelo!");

    String favouriteColor = input.nextLine( );

    System.out.println("Ora ti chiedo la tua data di nascita! In che giorno sei nato? Per favore scrivilo in cifre");

    int day = input.nextInt( );

    System.out.println("In che mese? Per favore, scrivilo in cifre");

    int month = input.nextInt( );

    System.out.println("E domanda da un milione di dollari... In che anno?");

    int year = input.nextInt( );

    int dateSum = day + month + year;

    System.out.println("La password che ti propongo è : " + name + "-" + surname + "-" + favouriteColor + "-" + dateSum );

    }

}
