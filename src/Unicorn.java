
public class Unicorn extends Animal {

    public Unicorn(String name) {
        super(name, "marshmallows");
    }

    @Override
    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food == this.favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep();
        }
        else {
            sleep();
        }
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps in a cloud.");
    }
}
