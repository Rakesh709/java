
class A extends Object{
    //constructor 
    
    public A(){
        super();
        System.out.println("In A");
    }

    
    public A(int n){
        super();
        System.out.println("In A Int");
    }



}

class B extends A {

    
    public B(){
        super();
        System.out.println("In B");
    }

    
    public B(int n){
        // super();
        this();
        System.out.println("In B Int");
    }
}


public class SuperThis {
    public static void main(String[] args) {
      B b = new B(5);   
    }    
}
