package com.dailyinterviewprojava.facebook;

import java.util.Scanner;

import com.dailyinterviewprojava.util.InputUtil;

/**
 * 
 * @author ema
 * You are given a list of numbers, and a target number k. Return whether or not there are two numbers in the list that add up to k.
 *
 * Example:
 * Given [4,7,1,-3,2] and k = 5,
 * return true since 4 + 1 = 5.
 * 
 * Try to do it in a single pass of the list.
 *
 */
public class TwoSum {
	
	public static void main(String...strings) {
		// Input
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] inputs = InputUtil.inputArr(input);
		int[] nums = InputUtil.integerArr(inputs);
		int k = scanner.nextInt();
		
		// Print output
		System.out.println(twoSum(nums, k));
		
		scanner.close();
	}
	
	static boolean twoSum(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == k) {
					return true;
				}
			}
		}
		
		return false;
	}
}
