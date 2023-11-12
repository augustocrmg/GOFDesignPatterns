package Behavioral.TemplateMethod;

public class Realization extends Specialization{
    protected void stepTwo(){
        System.out.println("Realization.stepTwo");
    }

    protected void step3_2(){
        System.out.println("Realization.step3_2");
    }

    protected void stepFour() {
        System.out.println("Realization.stepFour");
        super.stepFour();
    }
}