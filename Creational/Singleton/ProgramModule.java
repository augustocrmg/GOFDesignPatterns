package Singleton;

import java.util.Random;

public class ProgramModule {
    private static ProgramModule programModule;
    private int suspiciousValue;

    private ProgramModule(){
        Random random = new Random();
        this.suspiciousValue = random.nextInt(100);
    }

    public static ProgramModule getInstance(){
        if (programModule == null) {
            programModule = new ProgramModule();
        }

        return programModule;
    }

    public int getSuspiciousValue(){
        return suspiciousValue;
    }
}
