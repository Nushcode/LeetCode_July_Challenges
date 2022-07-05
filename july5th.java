import java.util.*;
public class july5th {
    class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int i : nums) {
                set.add(i);
            }
            int count = 0;
            int maxValue = 0;
            for(int i=0;i<nums.length;i++){
                int curr = nums[i];
                count = 1;
                if(!set.contains(curr-1)){
                    while(set.contains(curr+1)){
                        curr+=1;
                        count+=1;
                    }
                    maxValue = Math.max(count,maxValue);
                }
            }
            return maxValue;
        }
    }
}
