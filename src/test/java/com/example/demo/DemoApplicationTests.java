package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

  // @Test
  // void contextLoads() {
  // }

  @Test
  void testTwoSum() {
    // Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.
    // You can return the answer in any order.

    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] expected = {0, 1};

    int[] result = TwoSum.twoSum(nums, target);
    Assertions.assertArrayEquals(expected, result);
  }
}
