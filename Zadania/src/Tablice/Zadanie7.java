import java.util.Random;

public class Zadanie7 {
    public static void main (String [] args){

        double[] power = {23.45,-2.22,45.90,67.45,-56,-77,-34.8,90.4,234.11};
        int i=0;

        for(i = 0; i < 9; i++)
        {
            System.out.println("Element " + "[" + i + "] " + power[i]);
        }
        System.out.println( );
        Random random = new Random();
        int losuj = random.nextInt(9);
        int losuj2 = random.nextInt(9);

            if (power[losuj] > power[losuj2])
            {
                System.out.println("liczba " + power[losuj] + " jest większa od liczby " + power[losuj2]);

            }
            if (power[losuj] < power[losuj2])
            {
                System.out.println("liczba " + power[losuj] + " jest mniejsza od liczby " + power[losuj2]);

            }
            if (power[losuj] == power[losuj2])
            {
                System.out.println("liczba " + power[losuj] + " jest równa liczbie " + power[losuj2]);

            }


    }
}
