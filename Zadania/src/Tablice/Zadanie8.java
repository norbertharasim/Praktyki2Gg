import java.util.Random;
import java.util.Scanner;

public class Zadanie8
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz imie: ");
        String imie;
        imie = scanner.nextLine();
        System.out.println("Wybierz rasę: ");
        String rasa;
        rasa = scanner.nextLine();
        System.out.println("Wybierz klasę: ");
        String klasa;
        klasa = scanner.nextLine();
        System.out.println("Wybierz broń: ");
        String bron;
        bron = scanner.nextLine();
        System.out.println("Twoja Postać to : ");
        System.out.println( );
        System.out.println(imie);
        System.out.println(rasa);
        System.out.println(klasa);
        System.out.println(bron);

    }
}