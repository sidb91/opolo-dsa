package com.opolo.dsa.geeksYoutube.arrays;

public class TwoNoSwapNoTemp {

	public static void main(String[] args) {
		int m = 5, n = 3;

		m = m - n;
		n = m + n;
		m = n - m;

		System.out.println("M = " + m + " N = " + n);

	}

}
