public class Spawacz extends Praca{

private boolean niebezpieczna;
    public Spawacz(double pensja, String etat, boolean jestfajna, boolean niebezpieczna) {
        super(pensja, etat, jestfajna);
    }

    public boolean isNiebezpieczna() {
        return niebezpieczna;
    }

    public void setNiebezpieczna(boolean niebezpieczna) {
        this.niebezpieczna = niebezpieczna;
    }

    @Override
    public void wykonjePrace() {
        System.out.println("SPAWAM");
    }
}
