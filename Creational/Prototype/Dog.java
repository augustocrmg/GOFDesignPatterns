package Prototype;

public class Dog implements DogPrototype{
    private String name;
    private String race;

    public Dog(String name, String race){
        this.name = name;
        this.race = race;
    }

    @Override
    public DogPrototype clone() {
        return new Dog(this.name, this.race);
    }

    @Override
    public void showInfos(){
        System.out.println("Dog name: "+this.name);
        System.out.println("Dog race: "+this.race+"\n");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRace(String race){
        this.race = race;
    }
}
