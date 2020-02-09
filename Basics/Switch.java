import java.util.Scanner;

public class Switch{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int antwort;
        System.out.println("Wie viele Monde hat denn die Erde");
        antwort = s.nextInt();
        switch(antwort){
            case 0: 
                System.out.println("Leider zu wenig!");
                break;
            case 1:
                System.out.println("Richtig!");
                break;
            case 2:
                System.out.println("Zu viel!");
                break;
            default:
                System.out.println("FALSCH!");
                break;
        }   


    }
}
