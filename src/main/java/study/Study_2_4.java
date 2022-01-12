package study;

import java.util.Scanner;

public class Study_2_4 {
	public static void main(String[] args) {
		System.out.println("문자를 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		
		printCharArray(reverse(str));
	}
	public static char[] reverse(String str) {
		char[] chs = str.toCharArray();
		char[] charr = new char[chs.length];
		for(int i=chs.length;i<=1;i--) {
			charr[chs.length-i] = chs[i];
		}
		return charr;
	}
	
	public static void printCharArray(char[] a) {
		
		for(int i=0; i<a.length;i++) {
			
			System.out.print(a[i]);
		}
		System.out.println("\n");
	}
}
