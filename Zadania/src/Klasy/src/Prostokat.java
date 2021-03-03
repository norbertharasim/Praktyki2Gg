public class Prostokat {
    private int bokA, bokB;
    private double poleprostokata;

    public Prostokat(int bokA, int bokB){
        this.bokA = bokA;
        this.bokB = bokB;

    }

    public int getBokA() {
        return bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public int getBokB() {
        return bokB;
    }

    public void setBokB(int bokB) {
        this.bokB = bokB;
    }

    public double getPoleprostokata() {
        return poleprostokata;
    }

    public void setPoleprostokata(double poleprostokata) {
        this.poleprostokata = poleprostokata;
    }


    public void obliczaniePola(){
        poleprostokata=bokA * bokB;
    }
    public int ObliczaniePrzekatnej(){
        return(int) Math.sqrt(bokB*bokB+bokA*bokA);
    }

}
