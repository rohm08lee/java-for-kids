package com.roy.trial;

public class NumberSwiral7 {
	public static void main(String[] args) {
		int i, j, size;
		for (size = 4; size <= 17; size = size + 1) {
			for (i = 0; i <= size; i = i + 1) {
				for (j = 0; j <= size; j = j + 1) {
					if (i <= size/2) {
						if (i > j) {
							System.out.print(j + 1);
						}
						if ((i <= j) && (size - j >= i)) {
							System.out.print(i + 1);
						}
						if (size - j < i) {
							System.out.print(size - j + 1);
						}
					}
					else {
						if (size - i >= j) {
							System.out.print(j + 1);
						}
					
						if ((i >= j) && (size - i < j)) {
							System.out.print(size - i + 1);
						}
						if (i < j) {
							System.out.print(size - j + 1);
						}
					}
				}
				System.out.println();	
			}
			System.out.println();
			System.out.println("------------------------------");
			System.out.println();
		}
	}
}
