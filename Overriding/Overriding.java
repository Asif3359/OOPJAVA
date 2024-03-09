package Overriding;

class Super {
    public void display() {
        System.out.println("Super class Display");
    }

    public void show() {
        System.out.println("Super class Show");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Sub class Display");
    }

    public void show(int x) {
        System.out.println("Sub class Show");
    }
}

class Car {
    public void start() {
        System.out.println("Car Started");
    }

    public void accelerate() {
        System.out.println("Car is Accelerated");
    }

    public void changeGear() {
        System.out.println("Car Gear Changed");
    }

}

class LuxaryCar extends Car {

    public void changeGear() {
        System.out.println("Automatic Gear");
    }

    public void openRoof() {
        System.out.println("Sun Roof is Opened");
    }

}

public class Overriding {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub su = new Sub();
        su.display();
        su.show();

        // Super sup1 = new Sub();
        // sup1.display();

        LuxaryCar c = new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        c.openRoof();

        Car c1 = new LuxaryCar();
        c1.start();
        c1.accelerate();
        c1.changeGear();
        //c1.openRoof(); // error
    }
}
