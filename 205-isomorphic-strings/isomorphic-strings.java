class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        int index=0;
        for(Character c:s.toCharArray()){
            if(!map.containsKey(c)){
                if(map.containsValue(t.charAt(index)))
                    return false;
                map.put(c,t.charAt(index));
                index++;
            }
            else{
                if(map.get(c)==t.charAt(index)){
                    index++;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}