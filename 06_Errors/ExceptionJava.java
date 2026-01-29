//compile time : when javac Exception.java run it 
// run time : when application start but got error but don't stop it -- > exception
//logical error


//STATEMENT
// normal 
//critical




public class ExceptionJava {
    public static void main(String[] args) {
        int i=0;
        int j=0;

        try{
            j = 18/i;
        }catch(ArithmeticException e){
            System.out.println("Something went wrong");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in limit");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("Bye");
    }
};


// Exception Hierarchy

//object  -> throwable

// 1. error  --> thread death ->ioerror -> virtual machine error -> out of memmory error 

//2. Exception -> runtimeexception(_unchecked error ) -> SQL exception (forced you to handle it checked )