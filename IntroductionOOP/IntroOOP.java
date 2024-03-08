package IntroductionOOP;

/*
 * Basic Intro of oop in java
 */
// Class for CIrcle
/*
* This class outside IntroOOP Class 
 */
class circle {
    public double radius;

    // constructor of circle
    public circle() {
        this.radius = 0;
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }

}

class Rectangle {
    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        if (length == breadth) {
            return true;
        } else {
            return false;
        }
    }
}

class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }

    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;
    }

    public double volume() {
        return lidArea() * height;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

class Student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() >= 60)
            return 'A';
        else
            return 'B';
    }

    public String toString() {
        return "Roll No:" + roll + "\n" + "Name:" + name + "\n" + "Course:" + course + "\n" + "Total :" + total()
                + "\n";
    }
}

public class IntroOOP {
    // Class for Television
    /*
     * This class inside IntroOOP Class
     * and
     * data hiding
     */
    class Television {
        private int channel;
        private int volume;

        public void setChannel(int newChannel) {
            this.channel = newChannel;
        }

        public void SetVolume(int newVolume) {
            this.volume = newVolume;
        }

        public int getChannel() {
            return channel;
        }

        public int getVolume() {
            return volume;
        }

    }

    public static void main(String[] args) {
        IntroOOP intro = new IntroOOP(); // for inside class
        Television t1 = intro.new Television(); // for inside class
        t1.setChannel(10);
        System.out.println("Channel: " + t1.getChannel());

        circle c1 = new circle(); // for outside class
        circle c2 = new circle(4); // for outside class

        // value is assigned by constructor
        // c1.radius = 3;
        // c2.radius = 7;

        System.out.println("Area Of Circle-1: " + c1.area());
        System.out.println("Area Of Circle-2: " + c2.area());

        System.out.println("perimeter Of Circle-1: " + c1.perimeter());
        System.out.println("perimeter Of Circle-2: " + c2.perimeter());

        System.out.println("circumference Of Circle-1: " + c1.circumference());
        System.out.println("circumference Of Circle-2: " + c2.circumference());

        Rectangle rec1 = new Rectangle();
        rec1.breadth = 4;
        rec1.length = 4;

        System.out.println("Area of Rectangle :" + rec1.area());
        System.out.println("perimeter of Rectangle :" + rec1.perimeter());
        System.out.println("isSquare of Rectangle :" + rec1.isSquare());

        Cylinder cyl1 = new Cylinder();
        cyl1.height = 10;
        cyl1.radius = 10;

        System.out.println("lidArea of Cylinder :" + cyl1.lidArea());
        System.out.println("totalSurfaceArea of Cylinder :" + cyl1.totalSurfaceArea());
        System.out.println("volume of Cylinder :" + cyl1.volume());

        Student s = new Student();

        s.roll = 1;
        s.name = "John";
        s.course = "CS";
        s.m1 = 70;
        s.m2 = 80;
        s.m3 = 65;

        System.out.println("Total :" + s.total());
        System.out.println("Average :" + s.average());

        System.out.println("Details:\n " + s);

    }
}