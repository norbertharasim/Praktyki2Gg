import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main (String [] args){
            //ZADANIE 1-5
        ArrayList<Integer> arrayLista = new ArrayList<>(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Zadanie 1-5");
        System.out.println( );
        System.out.println("Podaj 10 liczb do arraylisty ");
        for (int i = 0; i < 10; i++){

    int l = scanner.nextInt();
            if(!arrayLista.contains(l)) {
                arrayLista.add(l);
            }
            else {
                i--;
                System.out.println(" Ta liczba znajduję się już w tej liście ");
            }

        }
        System.out.println( );

        for (int i = 0; i < arrayLista.size(); i++)
        {
            System.out.print(arrayLista.get(i) + " ");
        }
        System.out.println( );
        try
        {
            System.out.println("Wybierz które liczby chcesz usunąć");

            for (int i = 0; i < 5; i++ ) {
                int u= scanner.nextInt();
                System.out.println("Usuwam liczbę " + arrayLista.get(u - 1));
                System.out.println( );
                arrayLista.remove(u - 1);
for (int j = 0; j < arrayLista.size(); j++)
{
    System.out.print(arrayLista.get(j) + " ");
}
            }
            }
            catch (Exception e){
            e.printStackTrace();
        }
        //System.out.println("Podaj jakie liczby chcesz zamienić ");
        for (int i = 0; i < 2; i++) {
            System.out.println("Podaj kolejność liczby którą chcesz zamienić ");
            int a = scanner.nextInt();
            System.out.println("Zamieniam liczbę " + arrayLista.get(a - 1));
            System.out.println("Podaj na jaką liczbę chcesz zamienić tą liczbę");
            int p = scanner.nextInt();


            arrayLista.set(a-1,p);
        }
        System.out.println();
        for(int i = 0; i < arrayLista.size(); i++){
            System.out.print(arrayLista.get(i) + " ");
        }
    }
}