public class Praca
{
    private int pensja;
    private String etat;
    private boolean fajna;

    public Praca (double pensja, String etat, boolean jestfajna){
    }

    public boolean isFajna() {
        return fajna;
    }

    public void setFajna(boolean fajna) {
        this.fajna = fajna;
    }

    public int getPensja() {
        return pensja;
    }

    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    public void wykonjePrace(){
        System.out.println(" Wykonuje czynnosc");
    }

}
