package study;

import java.util.Scanner;

public class Study_2_1 {
	public static void main(String[] args) {
		System.out.println("금액을 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int money = sc.nextInt();
		
		while (money>0) {
			money%=50000;
		}
	}

}
