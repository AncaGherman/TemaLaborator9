package lab9tema;

public class Encapsulation {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        System.out.println("Cat is eating: ");
        c1.feed();
        System.out.println("Cat is sleeping: ");
        c1.sleep();
        System.out.println("Cat is eating again: ");
        c1.feed();
        System.out.println("Cat is playing: ");
        c1.play();


    }
}
