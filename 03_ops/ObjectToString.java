class Laptop{

    public String model;
    public int price;

    public String toString(){
        return model +":" + price;
    }

    public boolean equals(Laptop that){
if(this.model.equals(that.model) && this.price == that.price){
return true;
    }else{
        return false;
    }
    }
}



public class ObjectToString {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model="Dell";
        obj.price=1000;

        Laptop obj2 = new Laptop();
        obj2.model="Dell";
        obj2.price=1000;

        boolean result = obj.equals(obj2);

        System.out.println(result);
    }    
}
