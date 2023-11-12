package Builder;

public class BaconBurguerBuilder extends HamburguerBuilder {
    public void buildBread(){
        hamburguer.setBread("Australian");
    }

    public void buildSauce(){
        hamburguer.setSauce("Cheddar");
    }

    public void buildTopping(){
        hamburguer.setTopping("Bacon and Iceberg Lettuce");
    }
}
