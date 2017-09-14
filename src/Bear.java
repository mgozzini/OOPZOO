/*
public class Bear {
    String name = "";
    String favoriteFood= "";


    public Bear(String name){
        this.name = name;
        this.favoriteFood= "fish";
    }

    public void sleep() {
        System.out.println(name+ " hibernates for 4 months");
    }

    public void eat(String food) {
        System.out.println(name+ " eats " + food);
        if(food==favoriteFood){
            System.out.println("YUM!!! " + name + " wants more " + favoriteFood);
        }
        else{
            sleep();
        }
    }

    public static void main(String[] args) {

        Bear bear = new Bear("Bear");
        bear.eat("fish");
        bear.eat("kibble");

    }
}
*/

public class Bear extends Animal {
    public Bear(String name) {
        super(name, "fish");
    }

    @Override
    public void sleep() {
        System.out.println(name + " hibernates for 4 months");
    }
}
