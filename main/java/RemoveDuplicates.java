public class RemoveDuplicates {
    //在排好序的基础上，用两个下标来移动，遇到不同的元素交换位置即可
    public int removeDuplicates(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[index]){
                nums[++index] = nums[i];
            }
        }

        return index + 1;
    }
}
