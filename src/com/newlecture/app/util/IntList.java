package com.newlecture.app.util;

public class IntList {
	
	private int[] nums;
	private int current;
	
	public IntList() {
		nums = new int[3];
		current = 0;
	}
	
	public void add(int num) {
		nums[current] = num;
		current++;
	}

	public void clear() {
//		for(int i=0; i<current; i++)
//			nums[i];
//		[7][9][5][6]
//				C
		
//		nums = new int[3];
		
		current = 0;
	}

	public int size() {
		// TODO Auto-generated method stub
		return current;
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		if(current <= index)
			throw new IndexOutOfBoundsException();
		
		return nums[index];
	}

}
