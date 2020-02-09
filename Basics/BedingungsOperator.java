public class BedingungsOperator{
    public static void main(String args[]){
        int x = 3;
        int y = 4;
        int z = x < y? x:y; //die Zahl vor dem ? wird zu "true" oder "false" ausgewertet. Bei "true", nimmt er das linke, bei "false", nimmt er das rechte
                            //beim Doppelpunkt!
        System.out.println(z);
    }
}

