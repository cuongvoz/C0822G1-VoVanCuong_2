package ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public void howToEat() {
        System.out.println("could be fried");
    }

    @Override
    void makeSound() {
        System.out.println("Chicken: cluck-cluck!");
    }
}
