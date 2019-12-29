package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int st = -n / 2;
        for (int i = 0; i < n; i++) {
            if (n % 2 == 0 && st == 0){
                st++;
            }
            res[i] = st++;
        }
        return res;
    }
}