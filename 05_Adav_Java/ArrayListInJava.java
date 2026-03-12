import java.util.ArrayList;
import java.util.Collection;

public class ArrayListInJava {

    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(6);
        nums.add(6);

        for(int n: nums){
             System.out.println(n);
        }

       

    }
}

/*
collection api
map



collection -> list -> ArrayList and LinkedList
           -> Ques -> deque
            - set -> hashset


*/