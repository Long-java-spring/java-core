package main;

public class DemoAccessModifier {

    public static void main(String args[]) {
        Bird bird = new Bird();
        bird.name = "parrot";
        System.out.println("animal name: " + bird.getName());
        bird.fly();
    }
}

abstract class Animal {
    protected String name;

    protected void fly() {
        System.out.println(name + " can fly.");
    }

    public String getName() {
        return name;
    }
}

class Bird extends Animal {
    public Bird() {
        super();
    }

}
