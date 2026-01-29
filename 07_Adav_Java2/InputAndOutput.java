import java.util.Scanner;

public class InputAndOutput {
    public static void main(String[] args) {
        
        System.out.println("Enter the number:");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);
    }    
}
