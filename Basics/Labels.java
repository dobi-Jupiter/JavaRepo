public class Labels{
    public static void main(String args[]){
        //Name des Labels + Doppelpunkt
        //Greift dann auf die komplette Schleife, nicht nur auf die innere Schleife
        int beiZahl = 1;

        DieWhileSchleife: while(true){
            beiZahl++;

            for(int i = 2; i<beiZahl; i++){
                if(beiZahl%i == 0){
                    continue DieWhileSchleife;
                }
            }
        }

    }
}

