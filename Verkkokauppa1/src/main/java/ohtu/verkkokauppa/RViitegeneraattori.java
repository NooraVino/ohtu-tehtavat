package ohtu.verkkokauppa;

public class RViitegeneraattori implements Viitegeneraattori{


    private int seuraava;
    
    private RViitegeneraattori(){
        seuraava = 1;    
    }
    
 
    @Override
    public int uusi(){
        return seuraava++;
    }
}
