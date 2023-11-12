package AbstractMethod;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(Architeture.EMBER);
        CPU cpu = factory.createCPU();
    }
}
