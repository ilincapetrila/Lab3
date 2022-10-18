import java.util.List;

public class Controller {
    public List<Produkt> produkts;
    public List<Produkt> kategorieC(List<Produkt> produktsList){
        List<Produkt> anScadent = null;
        for (Produkt p:produktsList){
            if (p.getNachfrageLastYear()>p.getNachfrageThisYear()){
                anScadent.add(p);
            }
        }
        //optimale Produktions
        for(Produkt p:produktsList){
            p.setAnzahlNextYear(p.getAnzahlThisYear()*10/100);
        }

        return anScadent;
    }
    public List<Produkt> kategorieA(List<Produkt> produktsList){
        List<Produkt> anCrescator=null;

        for (Produkt p:produktsList){
            if (p.getNachfrageLastYear()<p.getNachfrageThisYear()) {
                anCrescator.add(p);
            }
        }
        //optimale Produktions
        for(Produkt p:produktsList){
            p.setAnzahlNextYear(p.getAnzahlThisYear()*2);
        }
        return anCrescator;
    }
    public List<Produkt> kategorieB(List<Produkt> produktsList){
        List <Produkt> anStangnant=null;
        for (Produkt p:produktsList){
            if(p.getNachfrageLastYear()==p.getNachfrageThisYear()) {
                anStangnant.add(p);
            }
        }
        for(Produkt p:produktsList){
            p.setAnzahlNextYear(p.getAnzahlThisYear()*100/90);
        }
        return anStangnant;
    }
    public void sortieren( List<Produkt> produktsList){
        List<Produkt> listaSortata;

    }

}

