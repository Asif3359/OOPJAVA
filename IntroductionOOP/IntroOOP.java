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
    public double length ;
    public double breadth ;

    public double area()
    {
        return length*breadth;
    }
    public double perimeter ()
    {
        return 2*(length+breadth);
    }
    public boolean isSquare()
    {
        if(length == breadth)
        {
            return true ;
        }
        else
        {
            return false;
        }
    }
}


public class IntroOOP {
    // Class for Television
    /*
     * This class inside IntroOOP Class
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
        circle c2 = new circle(); // for outside class

        c1.radius = 2.5;
        c2.radius = 7;

        System.out.println("Area Of Circle-1: " + c1.area());
        System.out.println("Area Of Circle-2: " + c2.area());

        System.out.println("perimeter Of Circle-1: " + c1.perimeter());
        System.out.println("perimeter Of Circle-2: " + c2.perimeter());

        System.out.println("circumference Of Circle-1: " + c1.circumference());
        System.out.println("circumference Of Circle-2: " + c2.circumference());

        Rectangle rec1 = new Rectangle();
        rec1.breadth = 4 ;
        rec1.length = 4 ;

        System.out.println("Area of Rectangle :"+rec1.area());
        System.out.println("perimeter of Rectangle :"+rec1.perimeter());
        System.out.println("isSquare of Rectangle :"+rec1.isSquare());


    }
}