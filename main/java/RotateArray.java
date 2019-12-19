public class RotateArray {
    //当我们旋转数组 k 次， k % array.length 个尾部元素会被移动到头部，剩下的元素会被向后移动。
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverce(nums,0,nums.length - 1);
        reverce(nums,0,k - 1);
        reverce(nums,k,nums.length - 1);
    }

    private void reverce(int[] nums,int startIndex,int endIndex){
        if(startIndex > endIndex){
            return;
        }

        while(startIndex <= endIndex){
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }
}
