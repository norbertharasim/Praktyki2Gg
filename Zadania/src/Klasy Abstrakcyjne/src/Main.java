public class Main
{
    public static void main(String[] args) {
        //ZADANIE 1
        System.out.println("ZADANIE 1");
        Pies Pies = new Pies();
        Pies.wiek();
        Pies.rasa();
        System.out.println();
        //ZADANIE 2
        System.out.println("ZADANIE 2");
        Samochod Samochod = new Samochod();
        Samochod.skrecWLewo();
        System.out.println();
        Samochod.skrecWPrawo();
        System.out.println();
        //ZADANIE 3
        System.out.println("ZADANIE 3");
        Jablon Jablon = new Jablon();
        System.out.println("Jabłoń");
        Jablon.gatunek();
        Jablon.wysokosc();
        Jablon.fotosynteza();
        Jablon.rosnie();
        System.out.println();
        //ZADANIE 4
        System.out.println("ZADANIE 4");
        Pies.badzMilutki();
        Pies.bawSie();
        System.out.println( );
        //ZADANIE 5
        System.out.println("ZADANIE 5");
        Kwadrat Kwadrat = new Kwadrat(5);
        System.out.println("Pole kwadratu o boku 5 wynosi " + Kwadrat.obliczPole());

        System.out.println("A obwod tego kwadratu wynosi " + Kwadrat.obliczObwod());
    }
}