class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i=0;
        int j=0;
        ArrayList<Integer> union=new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(i==0 || arr1[i]!=arr1[i-1]){
                union.add(arr1[i]);
            }
            i++;
            }
            else if(arr2[j]<arr1[i]){
                if(j==0 || arr2[j]!=arr2[j-1]){
                union.add(arr2[j]);}
            j++;
            }else{
              if(i==0 || arr1[i]!=arr1[i-1]){
                  union.add(arr1[i]);
                  
              }
                    i++;
                    j++;
              }
            }
        while(i<n){
            if(i==0 || arr1[i]!=arr1[i-1])
            union.add(arr1[i]);
            i++;
        }
        while(j<m){
            if(j==0 || arr2[j]!=arr2[j-1])
            union.add(arr2[j]);
            j++;
        }
        return union;
    }
}
