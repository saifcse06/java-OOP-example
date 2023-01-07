package Inheritance;

public class Main {
    public static void main(String[] args) {
        SubClass sp=new SubClass(20,5);
        sp.sumValue(); // use from super class
        sp.multiplicationValue(); // use from sub class
        sp.subtractionValue();
        sp.divValue();
    }
}
