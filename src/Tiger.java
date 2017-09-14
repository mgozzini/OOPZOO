/*
public class Tiger {

        String name = "";
        String favoriteFood="";


        public Tiger(String name) {
            // put your constructor content here
            this.name = name;
            this.favoriteFood= "meat";
        }

        public void sleep() {
            // complete your sleep function here, noting the change from global to instance variables
            System.out.println(name+ " sleeps for 8 hours");
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
            Tiger tiger = new Tiger("Tiger");
            tiger.eat("meat");
            tiger.eat("kibble");

        }

    }
*/


public class Tiger extends Animal{
    public Tiger(String name){
        super(name, "meat");
    }


}

