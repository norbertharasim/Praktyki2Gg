public class Trojkat {
private int podstawa;
private int bokA;
private int wysokosc;
private double pole;
private int obwod;

public Trojkat(int podstawa, int bokA, int wysokosc){
    this.podstawa = podstawa;
    this.bokA = bokA;
    this.wysokosc = wysokosc;
}
public int getPodstawa(){
    return podstawa;
}
    public int getBokA() {
        return bokA;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setPodstawa(int podstawa) {
        this.podstawa = podstawa;
    }
    public void setBokA(int bokA) {
        this.bokA = bokA;
    }
    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }
    public double getPole() {
        return pole;
    }
    public void setPole(double pole) {
        this.pole = pole;
    }
    public void obliczaniePola(){
    pole = (podstawa * wysokosc)/2;
    }

    public int getObwod() {
        return obwod;
    }

    public void setObwod(int obwod) {
        this.obwod = obwod;
    }

    public void obliczanieObwodu(){
    obwod= (bokA*2)+podstawa;

    }
}
