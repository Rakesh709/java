// TYPES OF INTERFACE
// 1. Normal : multiple methods
//2. FUnational : SAM : only one 
//3. Marker : no methods


@FunctionalInterface
interface A{
    void show();
    //void read(); Invalid '@FunctionalInterface' annotation; A is not a functional
}

class B implements A{
    public void show(){
        System.out.println("In show");
    }
}




public class AdvanceInterface {
    public static void main(String[] args) {
        
    }
}
