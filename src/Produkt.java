import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Produkt {

    private int anzahlThisYear;
    private int anzahlLastYear;
    private int verkauftThisYear;
    private int verkauftLastYear;

    public int getAnzahlNextYear() {
        return anzahlNextYear;
    }

    public void setAnzahlNextYear(int anzahlNextYear) {
        this.anzahlNextYear = anzahlNextYear;
    }

    private int anzahlNextYear;


    public Produkt(int anzahlThisYear, int anzahlLastYear, int verkauftThisYear, int verkauftLastYear) {
        this.anzahlThisYear = anzahlThisYear;
        this.anzahlLastYear = anzahlLastYear;
        this.verkauftThisYear = verkauftThisYear;
        this.verkauftLastYear = verkauftLastYear;
    }

    public int getAnzahlThisYear() {
        return anzahlThisYear;
    }

    public void setAnzahlThisYear(int anzahlThisYear) {
        this.anzahlThisYear = anzahlThisYear;
    }

    public int getAnzahlLastYear() {
        return anzahlLastYear;
    }

    public void setAnzahlLastYear(int anzahlLastYear) {
        this.anzahlLastYear = anzahlLastYear;
    }

    public int getVerkauftThisYear() {
        return verkauftThisYear;
    }

    public void setVerkauftThisYear(int verkauftThisYear) {
        this.verkauftThisYear = verkauftThisYear;
    }

    public int getVerkauftLastYear() {
        return verkauftLastYear;
    }

    public void setVerkauftLastYear(int verkauftLastYear) {
        this.verkauftLastYear = verkauftLastYear;
    }

    public int getNachfrageThisYear(){
        return anzahlThisYear / verkauftThisYear;
    }
    public int getNachfrageLastYear(){
        return anzahlLastYear / verkauftLastYear;
    }

//    @Override
//    public int compareTo(Produkt produs) {
//        //return this.getNachfrageThisYear().compareTo(produs.getNachfrageLastYear());
//    }


}



