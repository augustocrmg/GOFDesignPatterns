package Builder;

public class ArgulaBurguerBuilder extends HamburguerBuilder{
    public void buildBread(){
        hamburguer.setBread("Brioche bread");
    }

    public void buildSauce(){
        hamburguer.setSauce("Gorgonzola");
    }

    public void buildTopping(){
        hamburguer.setSauce("Argula");
    }
}
