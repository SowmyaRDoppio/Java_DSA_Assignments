class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String,Integer> winner=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(winner.containsKey(arr[i])){
                winner.put(arr[i],(winner.get(arr[i])+1));
            }else{
                winner.put(arr[i],1);
            }
        }
        int MaxVote=0;
        String Lexi="";
        for(Map.Entry<String,Integer> map:winner.entrySet()){
           int vote=map.getValue();
           String person=map.getKey();
           if((vote>MaxVote) || ((vote==MaxVote) && person.compareTo(Lexi)<0)){
              //compareTo() function is used to compare 2 strings lexicographically
              //0 if the string is equal to the other string.
              //< 0 if the string is lexicographically less than the other string
              //> 0 if the string is lexicographically greater than the other string (more characters)
               MaxVote=vote;
               Lexi=person;
           }
       }
       List<String> win=new ArrayList<>();
       win.add(Lexi);
       win.add(Integer.toString(MaxVote));
       return win.toArray(new String[0]);
    }
}
