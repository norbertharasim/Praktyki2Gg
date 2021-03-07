public class Zwierze {
    private int wiek;
    private int ilosckonczyn;
    private String nazwa;

    public int getIlosckonczyn() {
        return ilosckonczyn;
    }
    public Zwierze(int wiek, int ilosckonczyn, String nazwa){

        this.wiek = wiek;
        this.ilosckonczyn = ilosckonczyn;
        this.nazwa = nazwa;

    }

    public void setIlosckonczyn(int ilosckonczyn) {
        this.ilosckonczyn = ilosckonczyn;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }


    public void dajGlos(){
        System.out.println("Daje glos");
    }
}
