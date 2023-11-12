package Prototype;

public class DogDemo {
    public static void main(String[] args) {
        Dog newDog = new Dog("Blue Heeler","Boiadeiro");

        System.out.println("\nFirst registered dog: ");
        newDog.showInfos();

        Dog newDogClone = (Dog) newDog.clone();

        newDogClone.setName("Barão");

        System.out.println("Second registered dog: ");
        newDog.showInfos();

        Dog anotherDogClone = (Dog) newDog.clone();

        anotherDogClone.setName("Nani");
        anotherDogClone.setRace("Daschund");

        System.out.println("Third registered dog: ");
        anotherDogClone.showInfos();
    }
}
