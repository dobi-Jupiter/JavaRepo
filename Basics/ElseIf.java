public class ElseIf{
    public static void main(String args[]){
        int x;
        x = 4;

        if(x<3){
            System.out.println("X ist kleiner als 3");
        }else{
            System.out.println("X ist nich kleiner als 3");
        }

        int y;
        y = 2;

        if(y==3){
            System.out.println("Y ist gleich 3");
        }else{
            System.out.println("Y ist eine andere Zahl nämlich: " +y);
        }

        int z;
        z = 2;

        if(z!=3){
            System.out.println("Z ist eine andere Zahl nämlich: " +z);
        }else{
            System.out.println("Z ist gleich 3");
        }

        int iks;
        iks = 10;

        if(x>= 3 && iks < 11){
            System.out.println("x ist größer als 3 und iks kleiner als 11");
        }else{
            System.out.println("schaut net so gut aus");
        }

    }
}