import java.util.Scanner;



public class Zadanie3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean programIsRunning = true;

        while (programIsRunning){
            System.out.print("Podaj drzwi którymi wyjdziesz z lochu (1-5) ");
            String userInput = sc.next();

            switch (userInput)
            {
                case "1":{
                    programIsRunning = false;
                    break;
                }
                case "2":{
                    System.out.println("Wybrałeś złe drzwi próbuj dalej");
                    break;
                }
                case "3":{
                    System.out.println("Wybrałeś złe drzwi próbuj dalej");
                    break;
                }
                case "4":{
                    System.out.println("Wybrałeś złe drzwi próbuj dalej");
                    break;
                }
                case "5":{
                    System.out.println("Wybrałeś złe drzwi próbuj dalej");
                    break;
                }
                default:{
                    System.out.println("Nie wybrałeś żadnych drzwi !");
                }
            }
        }
        System.out.println(" Wybrałeś odpowiednie drzwi i opuściłeś lochy");

    }


}
