package AbstractMethod;

public class EnginolaToolkit extends AbstractFactory{
    @Override
    public CPU createCPU(){
        return new EnginolaCPU();
    }

    @Override
    public CPU createMMU(){
        return new EnginolaMMU();
    }
}
