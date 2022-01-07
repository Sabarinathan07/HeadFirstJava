// Abstract class keyword is used so that a object can be created
abstract public class Animals {
    private String food, name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeNoise() {
        System.out.println("Bark barkkk");
    }

    public void sleep(String animalName) {
        System.out.println(animalName + "  is  Zzzzz Zzzzzzzzzz");
    }

    public abstract void eat();

    public static void main(String[] args) {

        // Animals referece used for dog object eventhough it is declared as abstract
        Animals myDog = new Dog();
        myDog.makeNoise();
        myDog.setName("Dog");
        myDog.sleep(myDog.getName());
        myDog.eat();

        System.out.println("\n");
        Animals myCat = new Cat();
        myCat.makeNoise();
        myCat.sleep(myCat.getName());
        myCat.eat();

        // the next two line will show errors
        // Animals animal = new Animals();
        // animal.makeNoise();

    }
}

abstract class Canine extends Animals {
    public void makeNoise() {
        System.out.println("Bark Bark!!");
    }
}

abstract class Feline extends Animals {

    public void eat() {
        System.out.println("Feline animals eat non veg");
    }

    public void makeNoise() {
        System.out.println("Meow Meow!!");
    }
}

class Dog extends Canine {

    public void eat() {
        System.out.println("Dog eats cat");
    }

    public void makeNoise() {
        System.out.println("Oww OWwwwww!!!");
    }
}

class Cat extends Feline {

}
