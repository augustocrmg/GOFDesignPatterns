package Singleton;

public class App {
    public static void main (String[] args) throws Exception {
        ProgramModule p1 = ProgramModule.getInstance();
        ProgramModule p2 = ProgramModule.getInstance();
        
        System.out.println("Número aleatório: " + p1.getSuspiciousValue() + "\n");
        System.out.println("Número aleatório: " + p2.getSuspiciousValue() + "\n");
    }
}
