package ohtu.verkkokauppa;

public class RPankki implements Pankki {

    private static RPankki instanssi;

  
    private Kirjanpito kirjanpito;

    public RPankki(Kirjanpito kirjanpito) {
        this.kirjanpito = kirjanpito;
    }

   
    @Override
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}