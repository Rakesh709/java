
class Mobile{
    String brand;
    int price;
    static String name;
    // static variable is shared by all objects 
    //and its run first  satic varibale
    //static varibel belong to class 

    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }

    //static method

    public static void show1(){
        System.out.println("In static method");
    }

    //static block call only once 
    static{
        name="Phone";
        System.out.println("Inside static block");
    }

}


public class VariableConcpt  {
    public static void main(String[] s) throws ClassNotFoundException{

            // Mobile obj1= new Mobile();
            // obj1.brand="Apple";
            // obj1.price=400;
            // Mobile.name="smapPhone";


            // Mobile obj2= new Mobile();
            // obj2.brand="Nokia";
            // obj2.price=4000;
            // Mobile.name="smapPhone";

            // Mobile.name="Phone";
            // obj1.show();
            // obj2.show();
            
            // Mobile.show1();

            //if you want to load static class but not object created 

            Class.forName("Mobile");

    }    
}
