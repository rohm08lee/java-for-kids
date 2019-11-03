package com.roy.trial;

import java.util.Random;

public class Sorting1 {
	public static void main(String[] args) {
		int i, max, min, max2, min2, j;
		int mi1, mi2, mi3, mi4;
		int[] a;
		Random r;
		a = new int[15];
		r = new Random();
		max = 0;
		min = 21;
		min2 = 21;
		max2 = 0;
		mi1 = -1;
		mi2 = -1;
		mi3 = -1;
		mi4 = -1;
		
		for (i = 0; i <= 14; i = i + 1) {
			a[i] = r.nextInt(20)+ 1;
			//System.out.println(i + " 1 " + a[i]);
			for (j = 0; j <= i - 1; j = j + 1) {
				if (a[i] == a[j]) {
					a[i] = r.nextInt(20)+ 1;
					j = 0;
				}
				//System.out.println(i + " 2 " + a[i]);
			}
			if (a[i] < min) {
				min = a[i];
				mi1 = i;
				
			}
			if (a[i] > max) {
				max = a[i];
				mi2 = i;
			}
			if ((a[i] < min2) && (a[i] > min)) {
				min2 = a[i];
				mi3 = i;
			}
			if ((a[i] > max2) && (a[i] < max)) {
				max2 = a[i];
				mi4 = i;
			}
			System.out.print("[" + i + "] : " + a[i]);
			System.out.println();
		}
		System.out.println("The smallest is [" + mi1 + "] :" + min);
		System.out.println("The biggest is [" + mi2 + "] :" + max);
		System.out.println("The second smallest is [" + mi3 + "] :" + min2);
		System.out.println("The second biggest is [" + mi4 + "] :" + max2);
	}
}
