package com.example.demo.java;
import java.util.*;

/**
 * Problem 1: Find Duplicate Permissions
 * 
 * In an Android app, you have a list of permission requests from different modules.
 * Find all permissions that are requested more than once and return their count.
 * 
 * Example:
 * Input: ["CAMERA", "LOCATION", "CAMERA", "STORAGE", "LOCATION", "CAMERA"]
 * Output: {"CAMERA": 3, "LOCATION": 2}
 * 
 */
public class DuplicatePermissions {
    
    public static Map<String, Integer> findDuplicatePermissions(String[] permissions) {

       
    }
    
    // Test method
    public static void main(String[] args) {
        String[] permissions = {"CAMERA", "LOCATION", "CAMERA", "STORAGE", "LOCATION", "CAMERA"};
        System.out.println(findDuplicatePermissions(permissions));
    }
}
