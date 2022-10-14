package ss7_abstract_class_and_interface.practice.practice_1;

public class Chicken extends Animal implements Edible {
    @Override
    String makeSound() {
        return "Cục tác cục tác";
    }

    @Override
    public String howToEat() {
        return "Nướng hoặc luộc";
    }
}
