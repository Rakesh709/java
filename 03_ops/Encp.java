 class  Human {

    //this will run everytime when you create constructor 
    //like Human h1- new Human()
    //like Human h2- new Human()
    // it will run 2 times
    public Human(){
        //System.out.println("Inside the constructor");
        age=12;
        name="john";
    }

    public Human(int a, String n){
        age=a;
        name=n;
    }


    private int age =11;
    private String name = "Rakkesh";
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }  

    //methods
    // public int getAge(){
    //     return age;
    // }

    // public String getName(){
    //     return name;
    // }

    // public void setAge(int a){
    //     age=a;
    // }

    
}


public class Encp {
    public static void main(String[] a){
        Human obj = new Human();
        // obj.age=12;
        // obj.name="Rakesh";
    
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        Human obj2 = new Human(55,"goku");
        System.out.println(obj2.getName() +":"+obj2.getAge());
    }    
}
