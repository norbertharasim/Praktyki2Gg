
public class Main {
    public static void main(String[] args) {


        char litera = 'A';      //ZADANIE 1
        for (int i = 0; i < 26; i++) {
            if (i % 2 == 0)
                System.out.print(litera + "\t");
            litera++;
        }
        System.out.println();
        System.out.println();
        int a = 1;
        int b = 0;
        int x = 7;            //ZADANIE 2
        int c;
        for (int i = 1; i <= x; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
