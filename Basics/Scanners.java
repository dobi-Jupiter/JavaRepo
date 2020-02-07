import java.util.Scanner;

public class Scanners {
    public static void main(final String args[]) {

        // Möglichkeit dass der Benutzer festlegen kann, welche Variable benutzt werden soll.... Im Terminal eingeben
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie alt bist du?");
        i = scan.nextInt();

        if(i > 18){
            System.out.println("Du bist volljährig!");
        }else{
            System.out.println("Du bist leider noch nicht volljährig ;(");
        }

    }
}
        