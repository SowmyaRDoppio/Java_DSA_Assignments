class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
        
        // Your code here
         int ans=0;
        int rem=0;
        int cnt=0;
        int min=0;
        while(N>0){
            rem=N%2;
            if(rem==1){
                cnt++;
                if(cnt>min){
                    min=cnt;
                }
            }else{
                    cnt=0;
                }
            N=N/2;
        }
        
          // int ans=0;
        // int rem=0;
        // int count=0;
        // while(N!=0){
        //     rem=N%2;
        //     double c=Math.pow(10,count);
        //     ans+=rem*c;
        //     N=N/2;
        //   count++;
        // }
        // String answer=Integer.toString(ans);
        // int cnt=0;
        // int min=0;
        // int n=answer.length();
        // for(int i=0;i<n;i++){
        //     if(answer.charAt(i)=='1'){
        //         cnt++;
        //     }else if(answer.charAt(i)=='0'){
        //         if(cnt>min){
        //             min=cnt;
        //         }
        //         cnt=0;
        //     }
        // }
        
        
        return min;
    }
}
