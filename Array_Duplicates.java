import java.util.*;

public class Array_Duplicates {
    public List<Integer> findDuplicates(int[] arr) {
        // code here
        List<Integer> original = new ArrayList<>();
        Set<Integer> dup = new HashSet<>();
        for (int num : arr) {
            if (dup.contains(num)) {
                original.add(num);
            } else {
                dup.add(num);
            }
        }
        Collections.sort(original);
        return original;
    }
}
