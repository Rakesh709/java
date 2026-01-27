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
        }catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("Bye");
    }
};
