import java.util.ArrayList;
public class Runner {
    public static void main(String[] args){
        Tiger tiger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(tiger);
        animals.add(pooh);
    }
}
