public class RemoveDuplicateFromArray {
    public int removeDuplicateFromArray(int[] nums){
        int toReturn = 0;
        int length = nums.length;

        if(length == 0)
            return toReturn;

        for(int i = 1; i < length; i++){
            if (nums[i] != nums[toReturn]){
                toReturn++;
                nums[toReturn] = nums[i];
                }
            }

        return toReturn+1;
    }
}
