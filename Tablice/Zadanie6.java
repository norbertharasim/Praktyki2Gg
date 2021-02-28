public class Zadanie6 {

    public static void main (String [] args){

        double[] power = {23.45,-2.22,45.90,67.45,-56,-77,-34.8,90.4,234.11};
        int i=0;

        for(i = 0; i < 9; i++)
        {
            System.out.println("Element " + "[" + i + "] " + power[i]);
        }
        System.out.println( );
        System.out.println("PO ODWRÓCENIU ");
        System.out.println( );
        for(i = 8; i >= 0; i--)
        {
            System.out.println("Element " + "[" + i + "] " + power[i]);
        }
    }
}