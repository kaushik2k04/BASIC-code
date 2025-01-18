import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Solution{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer>l1=new ArrayList<>();

        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                l1.add(i);
                if(i!= (n/i)){
                l1.add(n/i);
            }
            }
            
        }
        Collections.sort(l1);
        return l1;
    }
}
