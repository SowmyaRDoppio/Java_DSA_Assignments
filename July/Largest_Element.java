class Solution {
    public static int largest(int n, int[] arr) {
        // code here
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar;
    }
}
