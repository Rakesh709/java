
class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A {

    public void show(){
        System.out.println("In B show");
    }
}


public class PolyMor1 {
    public static void main(String[] args) {
        // B obj = new B();
        // obj.show();
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        // A obj = new B();
        // ALWAYS DEPEND ON B OBJECT NOT A  
    }
}
