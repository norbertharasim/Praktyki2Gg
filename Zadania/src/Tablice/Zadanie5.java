public class Zadanie5 {

    public static void main (String [] args){

        double[] power = {23.45,-2.22,45.90,67.45,-56,234.11,-34.8,90.4,-77};
        double min = power[0];
        double max = power[0];
        int miejscemin = 0;
        int miejscemax = 0;
        int i=0;
        for(i = 0; i<9; i++)
        {
            if(max < power[i])   // jesli maksymalna liczba jest mniejsza niz elemt tablicy i
            {
                max = power[i]; //max jest tym elementem
                miejscemax = i;   // a pmax jest rowny miejscu gdzie ten element sie znajdowal
            }
            if(min > power[i])  //jesli minimalna liczba jest wieksza niz element w tablicy i
            {
                min = power[i]; // min jest tym elementem
                miejscemin = i;   // pmin jest miejscem tego elementu w tablicy
            }
            System.out.println("element [" + i + "] = " + power[i]);       //wyswietlenie tej tablicy
        }

        power[miejscemax] = min;  // miejsce z najwieksza  liczba jest najmniejsza liczba
        power[miejscemin] = max;  // miejsce z najmniejsza liczba jest najwieksza liczba

        System.out.println( );
        System.out.println("Po zamianie liczb największa z najmniejsza miejscami");
        System.out.println( );
        for(i = 0; i < 9; i++)
        {
            System.out.println("Element " + "[" + i + "] " + power[i]);
        }




    }
}
