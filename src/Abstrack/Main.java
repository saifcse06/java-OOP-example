package Abstrack;

public class Main {
    public static void main(String[] args) {
        AnimalAbstractClass v=new Lion();
        v.sound();
        AnimalAbstractClass l=new Tiger();
        l.sound();
        l.display();
        v.display();
    }
}
