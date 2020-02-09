package Objekte;

public class Main {
    public static void main(String args[]){
        Mensch karl = new Mensch(25,135);
        Mensch ute = new Mensch(80,111);
        karl.alter = 80;
        karl.name = "Karl";
        ute.alter = 55;
        System.out.println(karl.alter);
        System.out.println(ute.alter);
        System.out.println(karl.toString());
        
    }
}

