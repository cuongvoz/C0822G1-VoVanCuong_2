package ss7_abstract_class_and_interface.practice.animal_class_and_interface_edible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
      Animal[] animals = new Animal[] {new Tiger(),new Chicken()};
      animals[0].makeSound();
      animals[1].makeSound();
        for (Animal animal : animals) {
            animal.makeSound();

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                edibler.howToEat();
            }
        }
       Fruit[] fruit = {new Apple(),new Orange()};
       fruit[0].howToEat();
       fruit[1].howToEat();
    }
}
