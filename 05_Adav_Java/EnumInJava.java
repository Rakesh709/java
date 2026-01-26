

enum Status{
    Running, Failed, Pending, Success;
}

enum Laptop{
    Macbook(2000), Dell(4000), Xbox(3000), HP(7000);

     private int price;

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

   
    

}


public class EnumInJava {
    public static void main(String[] args) {
        Status s = Status.Running;
        // System.out.println(s);
        // System.out.println(s.ordinal());

        // Status[] s2= Status.values();
        // System.out.println(s2[0]);

        // for(Status s3: s2){
        //     System.out.println(s3);
        //}

        // if(s == Status.Running){
        //     System.out.println("All Good");
        // }else if(s == Status.Failed){
        //     System.out.println("Try Again");
        // }else if(s == Status.Pending){
        //     System.out.println("Please wait");
        // }else{
        //     System.out.println("Done");
        // }

        // switch (s) {
        //     case Running:
        //         System.out.println("ALL GOOD");
        //         break;
        //     case Failed:
        //         System.out.println("Try Again");
        //     default:
        //         System.out.println("Done");
        //         break;
        // }


        Laptop lap = Laptop.Macbook;
        System.out.println(lap +  " : " + lap.getPrice());

        for(Laptop mod: Laptop.values() ){
            System.out.println(mod +  " : " + mod.getPrice());
        }
    }    
}
