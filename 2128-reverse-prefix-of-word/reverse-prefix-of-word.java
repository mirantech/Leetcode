class Solution {
    public String reversePrefix(String word, char ch) {
        char arr[]=word.toCharArray();
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                while(i>j){
                   char temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                   j++;
                   i--;

                }
                return(new String(arr));
            }
        }
        return word;
    }
}