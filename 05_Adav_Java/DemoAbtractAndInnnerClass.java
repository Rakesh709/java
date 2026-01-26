
abstract class A{
    public abstract void show();
    public abstract void config();
}

public class DemoAbtractAndInnnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Inside NEW show");
            }

          
            public void config() {
                System.out.println("Inside the config");
            }
        };

        obj.show();
    }
}
