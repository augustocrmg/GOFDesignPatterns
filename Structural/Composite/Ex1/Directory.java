package Composite.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile{
    private String name;
    private List<AbstractFile> includedFiles = new ArrayList<>();    
    
    public Directory(String name){
        this.name = name;
    }

    public void add(AbstractFile abstractFile){
        includedFiles.add(abstractFile);
    }

    public void ls(){
        System.out.println("Directory: " + name);
        CompositeDemo.compositeBuilder.append("  ");

        for (AbstractFile abstractFile : includedFiles){
            abstractFile.ls();
        }
    }
}
