package com.biz.controller;

import java.util.Random;

public class Rank_Exec_03 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		int[] intKor = new int[10];
		int[] intEng = new int[10];
		int[] intMath = new int[10];
		int[] intTotal = new int[10];
		Random rnd = new Random();
		
		System.out.println("========================================");
		System.out.printf("학번\t국어\t영어\t수학\t총합\n");
		System.out.println("----------------------------------------");
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = i + 1;
			int kor = rnd.nextInt(50) + 51;
			int eng = rnd.nextInt(50) + 51;
			int math = rnd.nextInt(50) + 51;

			intKor[i] = kor;
			intEng[i] = eng;
			intMath[i] = math;
			
			intTotal[i] = kor + eng + math;
			
		}
		for(int i = 0; i < intNum.length; i++) {
			for(int j = i+1; j < intNum.length; j++) {
				if(intTotal[i]>intTotal[j]) {
					int _t = intTotal[i];
					intTotal[i] = intTotal[j];
					intTotal[j] = _t;
					
					int _t1 = intNum[i];
					intNum[i]= intNum[j];
					intNum[j] = _t1;
					int _t2 = intKor[i];
					intKor[i]= intKor[j];
					intKor[j] = _t2;
					int _t3 = intEng[i];
					intEng[i]= intEng[j];
					intEng[j] = _t3;
					int _t4 = intMath[i];
					intMath[i]= intMath[j];
					intMath[j] = _t4;
				}
			}
		}
		int index = 0;
		for(int i : intNum) {
			System.out.printf("%d\t%d\t%d\t%d\t%d\n",intNum[index],intKor[index],intEng[index],intMath[index],intTotal[index++]);
		}
		System.out.println("========================================");
	}

}
