// TYPES OF INTERFACE
// 1. Normal : multiple methods
//2. FUnational : SAM : only one 
//3. Marker : no methods


// lambda funtion works only with Funtinal interface


@FunctionalInterface
interface A{
    void show(int i);
    //void read(); Invalid '@FunctionalInterface' annotation; A is not a functional
}

@FunctionalInterface
interface B{
    int sum(int i,int j);
}

// class B implements A{
//     public void show(){
//         System.out.println("In show");
//     }
// }




public class AdvanceInterface {
    public static void main(String[] args) {
        A obj = (int i) -> System.out.println("In Show"+ i);
        obj.show(5);

        B s = (i,j) -> i+j;

        int result = s.sum(1,2);
        System.out.println(result);
    }
}

// -> : this is lambda expression : 