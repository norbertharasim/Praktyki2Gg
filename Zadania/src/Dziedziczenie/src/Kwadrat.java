public class Kwadrat extends Figura{
    public Kwadrat(double bokA){
        super(bokA);
    }

    public double policzPole(){
        return  getBokA() * getBokA();
    }

}