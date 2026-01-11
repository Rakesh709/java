

class Calculator  {

    int a;

    public int add(int n1, int n2){
        // System.out.println("in add");

        int r = n1+n2;
        return r;
    }

    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public int add(int n1, int n2, int n3, int n4){
        return n1+n2+n3+n4;
    }
    // above demo is called method overloading
    
}


class Computer {
    
    public void playMusic(){
        System.out.println("Playing music");
    }

    public String getMePen(int cost){
        if(cost>=10){
            return "pen";
        }else{
            return "Nothing";
        }
        
    }
    
}


public class Demo {
    public static void main(String[] args){
        // int num1=1;
        // int num2=2;

        // Calculator calc = new Calculator();

        // int result = calc.add(num1,num2);
        // System.out.println(result);

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(1);
        System.out.println(str);

    }
}
