
public class Main {

    public static void main(String[] args) {

        int myIntA = 1;
        int myIntX = 2;
        int myIntY = 4;
        double myDoubleB = 2.59;
        char myCharC ='N';
        String myStringD = "To jest moj ciag znakow";

        System.out.println(" To jest zmienna naturalna : " + myIntA); //Zadanie 1
        System.out.println(" To jest zmienna z przecinkiem : " + myDoubleB);
        System.out.println(" To jest zmienna ze znakiem : " + myCharC);
        System.out.println(" To jest zmienna z ciagiem znakow : " + myStringD);
        int sumInt=(myIntX*myIntX) + (myIntY*myIntY); //Zadanie 2
        System.out.println("Suma poteg liczb: " + myIntX + " i " + myIntY + " wynosi " + sumInt);

        double sqrt = Math.sqrt(3);//Zadanie 3
        int bok=7;
        System.out.println("Pole trojkata rownobocznego o dlugosci boku 7 cm rowna sie : " +((bok*bok)*sqrt)/4);

        String imienazwisko="Norbert Harasim"; //zadanie 4
        System.out.println("Moje imie i nazwisko to : " + imienazwisko);

    }
}