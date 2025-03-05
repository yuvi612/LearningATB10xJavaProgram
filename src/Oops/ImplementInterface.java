package Oops;

public class ImplementInterface implements TestInterface{

    @Override
    public void Test()
    {
        System.out.println("This is the abstract method from interface");
    }

    @Override
    public void Test2() {
        System.out.println("this is 2nd method from interface");
    }

    @Override
    public void non(){
        System.out.println("non");
    }

    public static void main(String[] args) {
        TestInterface ex = new ImplementInterface();
        ex.Test();
        ex.Test2();
        ex.non();

    }
}
