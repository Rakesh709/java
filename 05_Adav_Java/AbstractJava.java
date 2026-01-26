
abstract class Car{
    public abstract void drive();
    public abstract void fly();

    //abstract method belong to only abstarct class
    //important 
    //abastract class can be without abasract method
    //once you created abasrract method then call it in extend class

    public void playMusic(){
        System.out.println("Music Playing.");
    }
}

abstract class WagnaR extends Car{
    public void drive(){
        System.out.println("Driving wagnaR");
    }

    // public void fly(){
    //     System.out.println("flying.");
    // }
    //not able implemented method then that class will become abastarct class
}

//concrete class
class UpdatedWagnarR  extends WagnaR{
    public void fly() {
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }}


public class AbstractJava {
    public static void main(String[] args) {
        Car car = new UpdatedWagnarR();
        car.fly();
    }    
}
