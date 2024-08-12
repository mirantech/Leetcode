// import java.util.*;

class Solution
{
    public void solve(int[] nums, List<Integer> list, List<List<Integer>> result, int i)
    {
        if(i == nums.length)
        {
            result.add(new ArrayList<>(list)); 
            return;
        }

        // Include the current element
        list.add(nums[i]);
        solve(nums, list, result, i + 1);
        
        // Backtrack and remove the current element
        list.remove(list.size() - 1);

        // Skip over duplicates
        while(i + 1 < nums.length && nums[i] == nums[i + 1])
        {
            i++;
        }
        
        // Exclude the current element and move to the next
        solve(nums, list, result, i + 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums)
    {
        Arrays.sort(nums); // Sort the array to handle duplicates
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> list = new ArrayList<>();
        solve(nums, list, result, 0); 
        return result; 
    }
}
