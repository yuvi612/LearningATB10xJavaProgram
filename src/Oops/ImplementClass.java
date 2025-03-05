package Oops;

public class ImplementClass extends AbstractExample {

    @Override
     public void AbstractExample() {
        System.out.println("This is example of abstract method1");
    }

    @Override
     public void AbstractExample(String name) {
        System.out.println("This is example of abstract method2");
    }
}
