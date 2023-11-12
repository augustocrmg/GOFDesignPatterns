package Composite.Ex2;
import java.util.ArrayList;
import java.util.List;

public class Box implements Component{
    private List<Component> box = new ArrayList<>();

    public void add(Component component){
        box.add(component);
    }

    @Override
    public double calcValue(){
        double totalValue = 0;

        for (Component component : box){
            totalValue += component.calcValue();
        }

        return totalValue;
    }
}
