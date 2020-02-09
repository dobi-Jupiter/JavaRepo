package Objekte;

public class Mensch extends Lebewesen{
    private static int anzahlMenschen; //mit static ist es nicht an eine Instanz gebunden

    void bildung(){
        iq+=5;
    }
    Mensch(int wieAlt, int welcherIQ){
        //mit this ist das Hauptalter oben gemeint!
        this.alter = wieAlt;
        this.iq = welcherIQ;
        anzahlMenschen++;
    }
    int getAnzahlMenschen(){
        return anzahlMenschen;
    }

    // default
    // Mensch(){}

    public String toString(){
        return String.format("Name: %s\nAlter: %s\nIQ: %s\nSpeicheradresse: %s", name, alter, iq, super.toString());
    }
    
}


