import java.util.HashSet;
import java.util.Set;

public class DistinctPairs {
    public static void main(String[] args) {
        int a[] = {1,3,46,1,3,9};
        int k =47;
        int result = 0;
        Set<Integer> h1 = new HashSet<Integer>();
        Set<Integer> h2 = new HashSet<Integer>();
        for (int i=0;i<a.length;i++){
            if(!h2.contains(a[i])) {
                int val = k-a[i];
                if(h1.contains(val)) {
                    result++;
                    h2.add(a[i]);
                }
                else {
                    h1.add(a[i]);
                }
            }
        }
        System.out.println("Val is:"+result);
    }
}
