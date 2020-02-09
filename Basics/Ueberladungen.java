public class Ueberladungen{
    public static void main(String args[]){
        // sind Methoden, die wir überladen
        // Parameter müssen stimmen....
        // Das eine mit zwei Parametern, das andere mit drei.... Methode "rechnen" ist überladen

        int x, y, z, z1;
        x = 3;
        y = 5;
        z = 9;
        z1 = rechnen(x, y, z, 3, 5, 6, 7234);
        System.out.println(z1);

    }

//    public static int rechnen(int x, int y){
 //       int z;
  //      z = x + y;
  //      return z;
  //  }
  //  public static int rechnen(int x, int y, Boolean plus){
  //      int z;
   //     if(plus){
  //          z = rechnen(x, y);
   //         return z;
  //      }else{
  //          z = x - y;
  //          return z;
   //     }

    //beliebig viele Parameterübergaben in nur eine Methode...
    //es wird automatisch ein Array angelegt in der Länge, der mitgegebenen Parameter
    public static int rechnen(int... x){
        int z  = 0;
        for(int i = 0; i<x.length; i++){
            z+= x[i];
        }
        return z;

    }


}

