package ss7_abstract_class_and_interface.practice.practice_1;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();


        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Fruit x : fruits) {
            System.out.println(x.howToEat());
        }

    }
}
