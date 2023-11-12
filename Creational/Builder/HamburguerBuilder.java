package Builder;

public abstract class HamburguerBuilder {
    protected Hamburguer hamburguer;

    public Hamburguer getHamburguer(){
        return hamburguer;
    }

    public void newHamburguer(){
        this.hamburguer = new Hamburguer();
    }

    public abstract void buildBread();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
