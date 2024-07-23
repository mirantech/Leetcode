class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>h=new HashMap<>();
        int count=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(h.containsKey(ch)){
                // int a=h.get(ch);
                h.put(ch,h.get(ch)+1);
            }
            else
                h.put(ch,1);
        }
         for(int i=0;i<jewels.length();i++){
             char ch=jewels.charAt(i);
             if(h.containsKey(ch)){
                count+=h.get(ch);
             }
         }
        return count;
    }
}