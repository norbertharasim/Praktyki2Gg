public class Zadanie6 {
    public static void main (String [] args) {
        int i = 0, j = 0;
        for (i = 0; i < 11; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print("X");
            }
            System.out.println();
        }


        for (i = 0; i < 11; i++) {
            for (j = 10; j >i ; j--) {
                System.out.print("X");
            }
            System.out.println();

        }
    }
}
