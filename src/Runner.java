import java.util.ArrayList;
public class Runner {
    public static void main(String[] args){
        Tiger tiger = new Tiger("Tiger");
        Bear bear = new Bear("Pooh");
        Unicorn rarity =new Unicorn("Rarity");
        Giraffe gemma = new Giraffe("Gemma");
        Bee stinger = new Bee("Stringer");

        tiger.eat("meat");
        tiger.eat("kibble");

        bear.eat("fish");
        bear.eat("meat");

        rarity.eat("marshmallows");

        gemma.eat("meat");
        gemma.eat("leaves");

        stinger.eat("ice cream");
        stinger.eat("pollen");

    }
}
