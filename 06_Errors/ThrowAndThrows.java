public class ThrowAndThrows {
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("I don't want to print zero");
        }catch(ArithmeticException e){
            System.out.println("this is default output"+ e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in limit");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("Bye");
    }
}
