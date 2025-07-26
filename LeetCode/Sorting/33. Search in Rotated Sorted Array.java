class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
              if(nums[mid]==target) return mid;
            if(nums[l]<=nums[mid]){

              
                //left part
                //this part is sorted so do atarget check
                if(nums[l]<=target && target<=nums[mid]){
                    //yes target ispresent in this part
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                //right part is sorted
                if(nums[mid]<=target && target<=nums[h]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }
        }
        return -1;
    }
}
