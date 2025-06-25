class Solution {
    public int nextGreaterElement(int n) {
        String str=n+"";
        int arr[]=new int[str.length()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=n%10;
            n/=10;
        }
        for(int i=arr.length-1;i>=1;i--){
            if(arr[i-1]<arr[i]){
                System.out.print("\n Length:"+arr.length);
                System.out.print(Arrays.toString(arr));
                int val=arr[i-1];
                swap(i-1,val,arr);
                long ans=reverse(i,arr.length-1,arr);
                return (int)ans; 
            }
        }
        return -1;
    }
    public static void swap(int index,int num,int arr[]){
        for(int i=arr.length-1;i>index;i--){
            if(arr[i]>num){
                int temp=arr[i];
                arr[i]=num;
                arr[index]=temp;
                break;
            }
        }
    }
    public static long reverse(int i,int j,int arr[]){
        int temp=0;  //i->start j->end
        while(i<j){
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
        }
        long ans=0;
        for(int k=0;k<arr.length;k++){
            ans=ans*10+arr[k];
        }
        System.out.print(ans);
        if(ans>Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}