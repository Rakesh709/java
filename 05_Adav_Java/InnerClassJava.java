
class A{

    int age;

    public void show(){
        System.out.println("In Show");
    }

    //STATIC CLASS YOU CAN MENTION BUT ONLY IN INNER CLASS
    class B{
        public void config(){
            System.out.println("In Config");
        }
    }
}

public class InnerClassJava {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B objb = obj.new B();
        objb.config();
    }    
}
