
public class Giraffe extends Animal {

    public Giraffe(String name) {
        super(name, "leaves");
    }

    @Override
    public void eat(String food){
        if(food == this.favoriteFood) {
            System.out.println(name + " eats "+food);
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep();
        }
        else {
            System.out.println("YUCK!!! "+ name + " will not eat any "+food);
        }
    }
    @Override
    public void sleep() {
        System.out.println(name + " sleeps for 8 hours.");
    }
}
