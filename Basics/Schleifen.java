public class Schleifen{
    public static void main(String args[]){

        int x;
        x = 0;
        
        while(x<3){
            x++;
            System.out.println("Dies ist der " +x +" te Durchgang!");
        }
        System.out.println("Schleife beendet!");
        System.out.println("");

        // Do-While-Schleife
        System.out.println("Do-While-Schleife");
        x = 0;
        do{
            x++;
            System.out.println("Dies ist der " +x +" te Durchgang!");
        }while(x<3);
        System.out.println("Schleife beendet!");

        // For-Schleife
        System.out.println("For-Schleife");
        x = 0;
        for(int i = 0; i<3; i++){
            System.out.println(i);
        }
        System.out.println("Schleife beendet");

    }
}

