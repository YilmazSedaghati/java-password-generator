import java.util.Scanner;

public class PasswordGenerator {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Buongiorno! Oggi tramite il terminale, potrai generare una password dando alcuni dei tuoi dati! Partiamo subito, scrivimi il tuo nome.");

    String name = input.nextLine( );

    System.out.println("Perfetto!! Ora mi dici il tuo congome?");

    String surname = input.nextLine( );

    System.out.println("Perfetto!! Ora, hai un colore preferito? Scrivimelo!");

    String favouriteColor = input.nextLine( );

    System.out.println("Ora ti chiedo la tua data di nascita! Scrivila nel formato gg-mm-yyyy");

    String age = input.nextLine( );

    String yearBorn = age.substring(age.length( )-2);

    System.out.println("La password che ti propongo è : " + name + "-" + surname + "-" favouriteColor + "-" + yearBorn );

}
}
