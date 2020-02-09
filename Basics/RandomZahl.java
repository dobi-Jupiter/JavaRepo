import java.util.Random;

public class RandomZahl {
    public static void main(String args[]){
        //in .nexInt(10): Zahlen zwischen 0 und 9 --> also 10 Zahlen
        Random wuerfel = new Random();
        int y = wuerfel.nextInt(10);
        System.out.println(y);


    }
}