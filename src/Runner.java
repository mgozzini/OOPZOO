import java.util.ArrayList;
public class Runner {
    public static void main(String[] args){
        Tiger tiger = new Tiger("Tiger");
        Bear bear = new Bear("Pooh");
        Unicorn rarity =new Unicorn("Rarity");
        Giraffe gemma = new Giraffe("Gemma");
        Bee stinger = new Bee("Stringer");
        Zookeeper zoebot = new Zookeeper("Zoebot");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(tiger);
        animals.add(bear);
        animals.add(rarity);
        animals.add(gemma);
        animals.add(stinger);
        zoebot.feedAnimals(animals,"pizza");

    }
}
