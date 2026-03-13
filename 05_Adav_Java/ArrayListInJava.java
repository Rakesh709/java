import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListInJava {

    public static void main(String[] args) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<Integer>();
        Set<Integer> nums = new HashSet<Integer>();

        nums.add(6);
        nums.add(5);
        nums.add(4);

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