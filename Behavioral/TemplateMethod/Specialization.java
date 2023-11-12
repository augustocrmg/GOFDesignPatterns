package Behavioral.TemplateMethod;

abstract class Specialization extends Generalization {
    protected void stepThree(){
        step3_1();
        step3_2();
        step3_3();
    }

    private void step3_1(){
        System.out.println("Specialization.step3_1");
    }

    abstract protected void step3_2();

    private void step3_3(){
        System.out.println("Specialization.step3_3");
    }
}
