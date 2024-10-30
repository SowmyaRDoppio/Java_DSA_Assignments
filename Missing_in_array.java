import java.util.Arrays;

public class Missing_in_array {
    int missingNumber(int arr[]) {
        // code here
        Arrays.sort(arr);
        int i = 0;
        int n = arr.length;
        while (i < n) {
            if (arr[i] != i + 1) {
                return i + 1;
            } else {
                i++;
                continue;
            }
        }
        return arr.length + 1;
    }
}
