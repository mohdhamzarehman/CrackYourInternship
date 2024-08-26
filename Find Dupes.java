class Solution {
    public int findDuplicate(int[] nums) {
        //create a hashtable (key:value)
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int x : nums){
            //agar x present nahi hai to put kardo
            if(!hm.containsKey(x)){
                hm.put(x,1);
            }
            //hai to x ka count bada do
            else{
                hm.put(x,hm.get(x)+1);
            }
        }
        //agar x ka count>1  hai to return kardo
        for( int x : hm.keySet()){
            if(hm.get(x)>1){
                return x;
            }
        } 
        return -1;

    }
}
