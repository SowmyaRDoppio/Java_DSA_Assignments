class Solution {
    int isDigitSumPalindrome(int n) {
        // code here
        int sum=0;
        int temp=n;
        while(n!=0){
            temp=n%10;
            n=n/10;
            sum+=temp;
        }
        // System.out.println(sum);
        int new_n=sum;
        int rev=sum;
        int new_sum=0;
        while(sum!=0){
            rev=sum%10;
            new_sum =(new_sum*10)+rev;
            sum=sum/10;
        }
        if(new_sum==new_n){
            return 1;
        }
        else
        return 0;
        
    }
}
