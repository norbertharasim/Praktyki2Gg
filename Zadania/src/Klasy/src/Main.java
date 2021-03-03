import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//                  ZADANIE 1
        System.out.println("Zadanie 1");
        System.out.println( );
        Trojkat trojkat = new Trojkat(2, 4, 3);
        System.out.println("Pole trojkata o podstawie 2, boku 4 i wysokosci rownej 3 wynosi");
        trojkat.obliczaniePola();
        System.out.println(trojkat.getPole());
        System.out.println( );
        System.out.println("Obwod trojkata wynosi");
        trojkat.obliczanieObwodu();
        System.out.println(trojkat.getObwod());
//                  ZADANIE 2
        System.out.println( );
        System.out.println("Zadanie 2");
        System.out.println( );
        Prostokat Prostokat = new Prostokat(3, 4);
        System.out.println("Pole prostokata o bokach 3 i 4 wynosi");
        Prostokat.obliczaniePola();
        System.out.println(Prostokat.getPoleprostokata());
        System.out.println( );
        System.out.println("Przekatne tego prostokata wynosza ");
        Prostokat.ObliczaniePrzekatnej();
        System.out.println(Prostokat.ObliczaniePrzekatnej());
//                  ZADANIE 3
        System.out.println( );
        System.out.println("Zadanie 3");
        System.out.println( );
        if(trojkat.getBokA()> Prostokat.getBokA()){
            System.out.println("Bok trójkąta jest większy od boku prostokąta");
        }
        if (Prostokat.getBokA()>trojkat.getBokA()){
            System.out.println("Bok prostokąta jest większy od boku trójkąta");
        }
//                  ZADANIE 4
        System.out.println("Zadanie 4");
        System.out.println( );
boolean dzialaProgram = true;
        Scanner scan = new Scanner(System.in);
        while (dzialaProgram) {
Prostykalkulator kalkulator = new Prostykalkulator();
            System.out.println("1-dodawania, 2-odejmowanie, 3-mnozenie, 4-dzielenie, 5-stop");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Dodawanie, Podaj jakie liczby chcesz dodać: ");
                    double a = scan.nextDouble();
                    double b = scan.nextDouble();
                    System.out.println("Suma =" +kalkulator.dodawanie(a,b));
                    break;
                case 2:
                    System.out.println("Odejmowanie, Podaj jakie liczby chcesz odjąć: ");
                    double c = scan.nextDouble();
                    double d = scan.nextDouble();
                    System.out.println("Różnica =" +kalkulator.odejmnowanie(c,d));
                    break;
                case 3:
                    System.out.println("Mnożenie, Podaj jakie liczby chcesz mnożyć: ");
                    double e = scan.nextDouble();
                    double f = scan.nextDouble();
                    System.out.println("Iloczyn =" +kalkulator.mnozenie(e,f));
                    break;
                case 4:
                    System.out.println("Dzielenie, Podaj jakie liczby chcesz dodać: ");
                    double g = scan.nextDouble();
                    double h = scan.nextDouble();
                    System.out.println("Iloraz =" +kalkulator.dzielenie(g,h));
                    break;
                case 5:
                    System.out.println("Wyłączyłeś program kalkulator !");
                   dzialaProgram = false;
                    break;

            }
        }
        System.out.println( );
        Okrag Okrag = new Okrag(6, 3);
        System.out.println("Pole okręgu o średnicy 6 = " + Okrag.pole() + " Obwod tego okręgu = " + Okrag.obwod());


    }
}
