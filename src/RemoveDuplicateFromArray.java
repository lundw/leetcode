//Made by Will Lund
public class RemoveDuplicateFromArray {
    public int removeDuplicateFromArray(int[] nums){
        int toReturn = 0;
        int length = nums.length;

        //checks to see if the array has values and returns 0 if not.
        if(length == 0)
            return toReturn;

        //iterates through at O(n)
        for(int i = 1; i < length; i++){
            //check to see if our next two elements are not the same
            if (nums[i] != nums[toReturn]){

                //increment our integer counter toReturn as we found a new element in the array as well
                // as replace the element with the last matching element (if we iterated through 8 repeats we need
                //make the newest match the next in the list we search above
                toReturn++;
                nums[toReturn] = nums[i];
                }
            }

        return toReturn+1;
    }
}
