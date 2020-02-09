
public class Methodeen{
    public static void main(String args[]){
        SchreibeBrot();
        System.out.println("fertig!");
        SchreibeBrot();
        SchreibePfff();
        //Variablen an Methoden übergeben
        int x = 10;
        SchreibeX(x);


    }

    private static void SchreibeBrot(){
        System.out.println("Brot");

    }

    private static void SchreibePfff(){
        System.out.println("Pffff");
    }

    //Variablen an Methoden übergeben

    private static void SchreibeX(int y){
        System.out.println(y);
    }


}

