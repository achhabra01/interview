package com.example.demo.kotlin

class TwoSum {
    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * Assumptions:
     * Exactly one solution
     * You may not use the same element twice.
     * Positive integers
     * Sort is unavailable
     * Finite data set
     */
    
    fun twoSum(nums: IntArray, target: Int): IntArray {
            // Your solution will go here
            var prevNum = 0
            var currentNum = 0 
            var total = 0
            val list = IntArray()

            
           for(val n: nums) {
               currentNum = n

               total =  currentNum + prevNum

               if(target == total) {
                   val prevIndex =  nums.indexOf(prevNum)
                   val currentIndex = nums.indexOf(currentNum)
                   list.add(prevIndex)
                   list.add(currentIndex)
                   break;
               } else {
                    prevNum = currentNum    
               }
            
           }
           return list

    }  
    
}

/**
 * Example 1:
 * [1, 2, 10], 3
 * result = [0, 1]
 *
 * Example 2:
 * [1, 2, 10], 12
 * result = [1, 2]
 */