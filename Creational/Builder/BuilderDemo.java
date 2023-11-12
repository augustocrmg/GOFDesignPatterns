package Builder;

public class BuilderDemo {
    public static void main(String[] args){
        Waiter waiter = new Waiter();

        //HamburguerBuilder argulaBurguerBuilder = new ArgulaBurguerBuilder();
        HamburguerBuilder baconBurguerBuilder = new BaconBurguerBuilder();

        waiter.setHamburguerBuilder(baconBurguerBuilder);
        waiter.constructHamburguer();

        Hamburguer hamburguer = waiter.getHamburguer();

        System.out.println(hamburguer);
    }
}
