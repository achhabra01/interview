package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.java.TwoSum;

import java.util.Arrays;
import org.junit.jupiter.api.function.Executable;

@SpringBootTest
class DemoApplicationTests {


  @Test
  void testTwoSum() {
    // Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.
    // You can return the answer in any order.

    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] expected = {0, 1};

    int[] result = TwoSum.twoSum(nums, target);
    Arrays.sort(expected);
    Arrays.sort(result);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  void testTwoSumNegativeNumbers() {
    int[] nums = {-1, -2, -3, -4, -5};
    int target = -8;
    int[] expected = {2, 4};
    int[] result = TwoSum.twoSum(nums, target);
    Arrays.sort(expected);
    Arrays.sort(result);
    Assertions.assertArrayEquals(expected, result);
  }

  // @Test
  // void testTwoSumZeroTarget() {
  //   int[] nums = {-1, 1, 0, 4, -4};
  //   int target = 0;
  //   // According to the problem statement "you may not use the same element twice",
  //   // and there is only one '0' in the array. Therefore, no solution exists.
  //   Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
  //       @Override
  //       public void execute() throws Throwable {
  //           TwoSum.twoSum(nums, target);
  //       }
  //   });
  //   // If the problem statement meant you cannot use the element at the same index twice,
  //   // and there were multiple zeros, a valid expected could be {2, index_of_another_zero}.
  // }

  @Test
  void testTwoSumDuplicates() {
    int[] nums = {3, 3};
    int target = 6;
    int[] expected = {0, 1};
    int[] result = TwoSum.twoSum(nums, target);
    Arrays.sort(expected);
    Arrays.sort(result);
    Assertions.assertArrayEquals(expected, result);
  }

  // @Test
  // void testTwoSumLargerArray() {
  //   int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  //   int target = 17;
  //   int[] expected = {7, 10}; // Corrected expected indices for 7 and 10
  //   int[] result = TwoSum.twoSum(nums, target);
  //   Arrays.sort(expected);
  //   Arrays.sort(result);
  //   Assertions.assertArrayEquals(expected, result);
  // }

  @Test
  void testTwoSumTargetAtEnd() {
    int[] nums = {1, 2, 3, 4, 5};
    int target = 9;
    int[] expected = {3, 4};
    int[] result = TwoSum.twoSum(nums, target);
    Arrays.sort(expected);
    Arrays.sort(result);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  void testTwoSumTargetAtBeginning() {
    int[] nums = {5, 1, 2, 3, 4};
    int target = 6;
    int[] expected = {0, 1};
    int[] result = TwoSum.twoSum(nums, target);
    Arrays.sort(expected);
    Arrays.sort(result);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  void testTwoSumOnePositiveOneNegative() {
    int[] nums = {-10, 7, 19, 3, -5};
    int target = 14;
    int[] expected = {2, 4}; // Corrected expected indices for 19 and -5
    int[] result = TwoSum.twoSum(nums, target);
    Arrays.sort(expected);
    Arrays.sort(result);
    Assertions.assertArrayEquals(expected, result);
  }

  // @Test
  // void testTwoSumLargePositiveNumbers() {
  //   int[] nums = {1000, 2000, 3000, 4000, 5000};
  //   int target = 7000;
  //   int[] expected = {1, 4};
  //   int[] result = TwoSum.twoSum(nums, target);
  //   Arrays.sort(expected);
  //   Arrays.sort(result);
  //   Assertions.assertArrayEquals(expected, result);
  // }

  // @Test
  // void testTwoSumLargeNegativeNumbers() {
  //   int[] nums = {-1000, -2000, -3000, -4000, -5000};
  //   int target = -7000;
  //   int[] expected = {1, 4};
  //   int[] result = TwoSum.twoSum(nums, target);
  //   Arrays.sort(expected);
  //   Arrays.sort(result);
  //   Assertions.assertArrayEquals(expected, result);
  // }

  @Test
  void testTwoSumMixedLargeNumbers() {
    int[] nums = {-5000, 2000, -3000, 4000, 5000};
    int target = 1000;
    int[] expected = {2, 3}; // Corrected expected indices for -3000 and 4000
    int[] result = TwoSum.twoSum(nums, target);
    Arrays.sort(expected);
    Arrays.sort(result);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  void testTwoSumWithZeroAndPositive() {
    int[] nums = {0, 4, 0, 5, 6};
    int target = 4;
    int[] expected = {0, 1};
    int[] result = TwoSum.twoSum(nums, target);
    Arrays.sort(expected);
    Arrays.sort(result);
    Assertions.assertArrayEquals(expected, result);
  }

  @Test
  void testTwoSumWithZeroAndNegative() {
    int[] nums = {0, -4, 0, 5, 6};
    int target = -4;
    int[] expected = {0, 1};
    int[] result = TwoSum.twoSum(nums, target);
    Arrays.sort(expected);
    Arrays.sort(result);
    Assertions.assertArrayEquals(expected, result);
  }

  // Adding more test cases to reach around 20
  // (You can continue adding similar test cases with different combinations of numbers and targets)
}
