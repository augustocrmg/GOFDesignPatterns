package AbstractMethod;

enum Architeture {
    ENGINOLA, EMBER
}

abstract class AbstractFactory {
    private static EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();
    private static EmberToolkit EMBER_TOOLKIT = new EmberToolkit();

    static AbstractFactory getFactory(Architeture architeture){
        AbstractFactory factory = null;
        switch (architeture) {
            case ENGINOLA:
                factory = ENGINOLA_TOOLKIT;
                break;
            case EMBER:
                factory = EMBER_TOOLKIT;
                break;
        }
        return factory;
        
    }

    public abstract CPU createCPU();
    public abstract MMU createMMU();
}
