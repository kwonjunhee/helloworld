package study;

import java.util.Arrays;

public class Study_1_5 {

	public static void main(String[] args) {
		
		for (int i=1; i<=99;i++) {
			int cnt =0;
			String num = Integer.toString(i);
			String[] arr = num.split("");
			
			if(Arrays.asList(arr).contains("3")) cnt++;
			if(Arrays.asList(arr).contains("6")) cnt++;
			if(Arrays.asList(arr).contains("9")) cnt++;
			
//			System.out.println(Arrays.toString(arr)+ cnt);
			if(cnt>0) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[j]);
				}
				for(int k=0;k<cnt;k++) {
					System.out.print(" 짝");
				}
				System.out.println("\n");
			}

		}

	}

}
