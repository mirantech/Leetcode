class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,0);
            }
            else{
                map.put(c,map.get(c)+1);
            }
        }
        char val='\0';
        for(Character i:map.keySet()){
            if(map.get(i)==0){
                val=i;
                break;
            }
        }
        if(val!='\0'){
            System.out.print(val);
            return s.indexOf(val);
        }
        return -1;
    }
}