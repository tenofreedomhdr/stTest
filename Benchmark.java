package com.java24hours;

public class Benchmark {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 6000;
		long index = 5;
		Fuck:
		while (true) {
			double x = index= index / 3;
			long z = System.currentTimeMillis();
			if (z > endTime) {
				break Fuck;
			}
			index++;
		System.out.println(index);
		}

	}

}