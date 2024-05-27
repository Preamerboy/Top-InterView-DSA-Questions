//Link->https://leetcode.com/problems/longest-substring-without-repeating-characters
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] store=new int [100];
        char [] arr=s.toCharArray();
        int i=0, max=0;
        for(int j=0;j<arr.length;j++){
            int a=arr[j]-' ';
            if(store[a]!=0){
                while(arr[i]!=arr[j]){
                    store[arr[i]-' ']=0;
                    i++;
                }
                i++;
            }
            store[a]=1;
            max=Math.max(j-i+1,max);
        }
        return max;
    }
}
