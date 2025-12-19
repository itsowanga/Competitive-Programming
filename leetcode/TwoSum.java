package leetcode;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order. 

*/
public class TwoSum {

    public static void main(String[] args) {
        
        int[] nums = {3, 3};
        int target = 6;

        int[] ans = twoSum(nums, target);
        System.out.println("["+ans[0]+", "+ans[1]+"]");

    }

    public static int[] twoSum(int[] nums, int target) {

        int[] solution = new int[2];

        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    solution[0] = i;
                    solution[1] = j;
                    return solution;
                }
            }
    }

    return solution;
}
}
