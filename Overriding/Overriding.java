package Overriding;

class Super {
    public void display()
    {
        System.out.println("Super class Display");
    }
    public void show()
    {
        System.out.println("Super class Show");
    }
}
class Sub extends Super {
    @Override
    public void display()
    {
        System.out.println("Sub class Display"); 
    }
    public void show(int x)
    {
        System.out.println("Sub class Show");
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


    }
}
