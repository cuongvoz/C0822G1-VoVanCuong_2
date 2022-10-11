package ss5_accesmodifier_static.practice.practice_2;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("BMW X6","Skyactiv 3");
        Car car2 = new Car("Mazda 3","Skyactiv 6");
        Car car3 = new Car("BMW X6","Skyactiv 3");
        Car car4 = new Car("Mazda 3","Skyactiv 6");
        Car car5 = new Car("Mazda 3","Skyactiv 6");

        System.out.println("Số Lượng xe là : " + Car.numberOfCar);
    }
}
