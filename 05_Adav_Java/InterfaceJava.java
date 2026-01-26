// class -> class  -> extends
//class  -> interface -> implments
//interface -> interface -> extends



interface A{ 
    // IN INTERFACE ALL THE VAIBALE ARE FINAL AND STATIC
    int age=30;
    String location ="Hyd";

    public void show();
    public void config();
}

interface X{
    void run();
}

interface Y extends X{

}

class B implements A,Y {

    
    public void show() {
         System.out.println("Inside the show");    
    }

    
    public void config() {
        System.out.println("Inside the config");
    }


    public void run() {
        System.out.println("Run");
    }
    
}



public class InterfaceJava {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }    
}
