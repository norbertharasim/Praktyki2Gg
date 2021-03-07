public class Main
{
    public static void main(String[] args)
    {
        //ZADANIE 1
        System.out.println("Zadanie 1");
    Kwadrat Kwadrat = new Kwadrat(4);
    System.out.println( "Pole kwadratu wynosi " + Kwadrat.policzPole());
    Prostokat prostokat = new Prostokat(2, 3);
    System.out.println("Pole prostokata wynosi " + prostokat.policzPole());
    System.out.println( );
       //ZADANIE 2
        System.out.println("Zadanie 2");
       Pies Pies = new Pies (2, 4,"Burek", "Czarna", 20);
       Pies.dajGlos();
        System.out.println( );
        //ZADANIE 3
        System.out.println("ZADANIE 3");
        Spawacz Spawacz = new Spawacz(8000, "Pelny", true,true);
        Spawacz.wykonjePrace();
        System.out.println( );
        //ZADANIE 4
        System.out.println("ZADANIE 4");
        System.out.println("Pytanie piewrsze: \n Odpowiedź: MethodTwo, Methodfour ");
        System.out.println( );
        System.out.println("Pytanie drugie: \n Odpowiedź: MethodThree, MethodOne  ");
    }
}