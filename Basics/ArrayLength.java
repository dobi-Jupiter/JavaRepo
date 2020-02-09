import java.util.Scanner;

public class ArrayLength{
    public static void main (String args[]){
        //casting --> möglichst selten benutzen!
        System.out.println("Casting");
        long x = 5;
        int y = (int)x;
        System.out.println(y);

        System.out.println("Arrays");
        //Arrays
        Scanner s = new Scanner(System.in);
        int anzahl = s.nextInt();
        int[] array = new int[anzahl];
        for(int i = 0; i<array.length; i++){
            array[i] = s.nextInt();
        }
        System.out.print("[");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(",");
            }else{
                break;
            }
        }
        System.out.print("]");


    }
}


