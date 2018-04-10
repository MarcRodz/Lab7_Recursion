package SortingClasses;

import java.util.ArrayList;
import java.util.Random;

public class sortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		Random ran = new Random();
		for(int i=0; i<20; i++) {
			al.add(ran.nextInt(20));
		}
		System.out.println("List unsorted: " + al);
		MergeSort.mergeSortArr(al);
		System.out.println("List sorted: " + al);

	}
}