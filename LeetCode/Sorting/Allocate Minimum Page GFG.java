class Solution {
    
    private static boolean isPossible(int arr[],int n, int k,int sol){
        int student=1;
        int pageSum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>sol) return false;
            if(arr[i]+pageSum>sol){
                student++;
                pageSum=arr[i];
                if(student>k) return false;
            }
            else{
                pageSum+=arr[i];
            }
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        int start=Arrays.stream(arr).max().getAsInt();
        int end=Arrays.stream(arr).sum();
        int result=-1;
        
        if(k>n) return -1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isPossible(arr,n,k,mid)){
                result=mid;
                end=mid-1;
            }
            else{
              
                  start=mid+1;
            }
        }
        return result;
        
    }
}
