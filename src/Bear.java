/*
public class Bear {
    String name = "";
    String favoriteFood= "";


    public Bear(String name){
        this.name = name;
        this.favoriteFood= "fish";
    }

    public void sleep() {
        // complete your sleep function here, noting the change from global to instance variables
        System.out.println(name+ " hibernates for 4 months");
    }

    public void eat(String food) {
        // complete your eat function here!
        System.out.println(name+ " eats " + food);
        if(food==favoriteFood){
            System.out.println("YUM!!! " + name + " wants more " + favoriteFood);
        }
        else{
            sleep();
        }
    }

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

        Bear bear = new Bear("Pooh");
        bear.eat("fish");
        bear.eat("meat");

    }
}
*/

public class Bear extends Animal {
    // complete the Bear class here, using the completed Tiger class as an example
    public Bear(String name) {
        super(name, "fish");
        this.name = name;
        this.favoriteFood = favoriteFood;
    }
    // here, we override the sleep function
    @Override
    public void sleep() {
        System.out.println(name + " hibernates for 4 months");
    }
}
