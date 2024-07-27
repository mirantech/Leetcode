class Solution {
    public int mostWordsFound(String[] arr) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            String arr1[]=arr[i].split(" ");
            ans=Math.max(ans,arr1.length);
        }
        return ans;
    }
}