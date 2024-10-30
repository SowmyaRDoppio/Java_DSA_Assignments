import java.util.ArrayList;
import java.util.Collections;

public class Array_Leaders {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        // int i=0;
        // int j=0;
        int n = arr.length;
        int maximum = arr[n - 1];
        ArrayList<Integer> leader = new ArrayList<>();
        leader.add(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maximum) {
                maximum = arr[i];
                leader.add(arr[i]);
            }
        }
        Collections.reverse(leader);
        return leader;
    }
}
