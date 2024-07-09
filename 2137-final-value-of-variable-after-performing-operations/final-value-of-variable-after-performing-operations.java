class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a=0;
        for(int i=0;i<operations.length;i++){
            String str=operations[i];
            switch(str){
                case "X++":
                    a=a+1;
                    break;
                case "++X":
                    a=a+1;
                    break;
                case "X--":
                    a=a-1;
                    break;
                case "--X":
                    a=a-1;
                    break;
            }
        }
        return a;
    }
}