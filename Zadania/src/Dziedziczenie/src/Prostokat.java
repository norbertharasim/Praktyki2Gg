public class Prostokat extends Figura {
    private double bokB;
    public Prostokat(double bokA, double bokB){
        super(bokA);
        this.bokB = bokB;
    }
    public double getBokB()
    {
        return bokB;
    }
    public void setBokB(double bokB)
    {
        this.bokB = bokB;
    }
    public double policzPole(){
        return  getBokA() * getBokB();
    }
}
