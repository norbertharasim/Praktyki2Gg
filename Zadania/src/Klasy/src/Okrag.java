public class Okrag {
private double srednica,promien;

public Okrag (double srednica, double promien){
    this.srednica = srednica;
    this.promien = srednica/2;
}
    public void setPromien(int promien) {
        this.promien = promien;
    }

    public void setSrednica(int srednica) {
        this.srednica = srednica;
    }
    public double pole(){
    return 3.14*(promien*promien);
    }
public double obwod(){
    return 2*3.14*promien;
}

}
