import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int tablica[] = new int[4];
        try {
            System.out.println("Podaj liczby do tablicy ");
            for (int i = 0; i <= 4; i++) {
                tablica[i] = Scanner.nextInt();
            }
        }catch (InputMismatchException e) {
            System.out.println("Podano niepoprawną liczbę ");

        }catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Podano za dużo liczb ");
        }
    }
}