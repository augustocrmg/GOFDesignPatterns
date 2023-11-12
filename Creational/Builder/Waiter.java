package Builder;

public class Waiter {
    private HamburguerBuilder hamburguerBuilder;

    public void setHamburguerBuilder(HamburguerBuilder hb){
        hamburguerBuilder = hb;
    }

    public Hamburguer getHamburguer(){
        return hamburguerBuilder.getHamburguer();
    }

    public void constructHamburguer(){
        hamburguerBuilder.newHamburguer();
        hamburguerBuilder.buildBread();
        hamburguerBuilder.buildSauce();
        hamburguerBuilder.buildTopping();
    }
}
