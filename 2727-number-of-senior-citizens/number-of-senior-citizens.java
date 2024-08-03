class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String ans=details[i].charAt(11)+"";
            ans+=details[i].charAt(12)+"";
            if(Integer.parseInt(ans)>60){
                count+=1;
            }
        }
        return count;
    }
}