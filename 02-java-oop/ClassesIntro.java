

public class ClassesIntro {

    public static void main(String[] args) {

        Car myCar = new Car("Julia's car");;
        Car anotherCar = new Car("The Batmobile");

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        myCar.accelerate();

        anotherCar.brake();
    }
}

class Car {

    private int speed = 0;
    private String name;

    public Car(String name) {
        this.name = name;

    }

    public void accelerate() {
        speed++;
        System.out.printf("%s is going %d kilometers per hour.%n", name, speed);
    }

    public void brake() {
        --speed;
        System.out.printf("%s is going %d kilometers per hour.%n", name, speed);
    }
}