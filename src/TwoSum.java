//Made by Will Lund
public class TwoSum {
    //take in an int array containing only one answer pair and the target sum
    public int[] twoSum(int[] nums, int target){
        //iterate through in O(n)
        for(int i = 0; i < nums.length; i++){
            //iterate through in O(n)
            for(int j = i+1; j < nums.length; j++){
                //check if you have the two sums
                if(nums[j] == target - nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        //issue if the array did not have a pair that reached the target sum
        throw new IllegalArgumentException("No solution.");
    }
}
