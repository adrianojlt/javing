package pt.adrz.samples.tmp;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		int[] x = new int[4];

		x[0] = 2;
		x[1] = 4;
		x[2] = 3;
		x[3] = 10;
		
		int[] y = new int[6];
		
		y[0] = 8;
		y[1] = 24;
		y[2] = 3;
		y[3] = 20;
		y[4] = 1;
		y[5] = 17;
		
		int[] z = new int[6];
		
		z[0] = 7;
		z[1] = 21;
		z[2] = 3;
		z[3] = 42;
		z[4] = 3;
		z[5] = 7;
		
		//solution(x);
		//solution(y);
		solution(z);
	}
	
	public static int solution(int[] A) {
		
		List<Point> list = new LinkedList<Point>();

		for ( int i = 0 ; i < A.length ; i++ ) {
			for ( int j = 0 ; j < i ; j++ ) {
				System.out.println(A[j] + "-" + A[i]);
				int res = Math.abs(A[j]-A[i]);  
				Point p = new Point(i, j, res);
				list.add(p);
			}
		}
		
		Collections.sort(list, new MyComparator());
		
		System.out.println("*****");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			if ( list.get(i).s != list.get(i+1).s ) break;
		}
		
		return 0;
	}
}

class MyComparator implements Comparator<Point> {

	@Override
    public int compare(Point a, Point b) {
		 return a.s < b.s ? -1 : a.s > b.s ? 1 : 0;
    }
}

class Point {

	public int i;
	public int j;
	public int s;
	
	public Point(int i, int j, int s) {
		this.i = i;
		this.j = j;
		this.s = s;
	}
	
	public String toString() {
		return "sum = " + s + "; " + i + ":" + j;
	}
}

