// your solution here
//fix all the errors including package errors
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
 interface shape{
    void create();
    double findPerimeter ();
}

class Rectangle implements shape{
    double a;
    double b;
    @Override
    public void create() {
        System.out.println("you have created a triangle ");
    }

    @Override
    public double findPerimeter() {
        return (a+b) * 2;
    }
}

class Square implements shape{
    double a;

    @Override
    public void create() {
        System.out.println("you have created a Square ");
    }

    @Override
    public double findPerimeter() {
        return a*4;
    }
}

class Circle implements shape{
    double radious;
    @Override
    public void create() {
        System.out.println("you have created a Circle");
    }

    @Override
    public double findPerimeter() {

        return 3.14 * 2 * this.radious;
    }
}
