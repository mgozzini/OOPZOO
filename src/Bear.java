
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
