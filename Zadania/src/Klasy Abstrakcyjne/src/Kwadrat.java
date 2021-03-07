public class Kwadrat implements ObliczeniaDlaFigur {
    private int bokA;

    public Kwadrat(int bokA){
        this.bokA = bokA;
    }

    public void setBokA(int bokA) {
        this.bokA = bokA;
    }

    public double getBokA() {
        return bokA;
    }
    @Override
    public int obliczPole(){
        return bokA * bokA;
    }
    @Override
    public int obliczObwod(){
        return 4 * bokA;
    }
}
