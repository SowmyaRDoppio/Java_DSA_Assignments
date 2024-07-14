class Solution {
    public boolean arraySortedOrNot(List<Integer> arr) {
        // code here
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
