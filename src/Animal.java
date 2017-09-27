
class Animal {
    static int population = 0;
    String favoriteFood;
    String name;

    public Animal(String name, String favoriteFood) {
        population ++;
        this.favoriteFood = favoriteFood;
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food == this.favoriteFood) {
            System.out.println("YUM!!! " + name + " wants more " + food);
        }
        else {
            sleep();
        }
    }

    public void populationCount(){
        System.out.println(population);
    }

}


