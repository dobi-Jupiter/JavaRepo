public class foreach{
    public static void main(String args[]){
        int[] x = new int[10];
        for(int i = 0; i<x.length; i++){
            x[i] = i;
        }
        //!!!foreach-Schleife ist extra für Arrays!!!
        for(int j: x){
            j++;
            System.out.println(j);
        }


    }
}

