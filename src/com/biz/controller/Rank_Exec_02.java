package com.biz.controller;

import java.util.Random;

public class Rank_Exec_02 {

	public static void main(String[] args) {
		
		/* 
		 * �й��� ���������� ���� �迭�� �����ϰ�
		 * �й��� 1������ ������� �ο��ϰ�
		 * ���������� ���� ������ �����Ͽ� ����
		 */
		
		int[] intNum = new int[10];
		int[] intKor = new int[10];
		
		Random rnd = new Random();
		
		for(int i = 0; i < intNum.length; i++) {
			intNum[i] = i+1;
			intKor[i] = rnd.nextInt(50)+51;
		}
		int index = 0;
		for(int num : intNum) {
			System.out.printf("%d : %d \t \n", num,intKor[index++]);
		}
		System.out.println();
		
		/*
		 * ���� ������ �������� �������� ���� ����
		 */
		for(int i = 0; i < intNum.length; i++) {
			for(int j = i+1; j < intNum.length; j++) {
				if (intKor[i] > intKor[j] ) {
					// ������ ���� ������ ��� ��ġ�� �����Ǹ�
					int _t = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _t;
					
					// �й��� ����� ��ġ�� ������ ����� �Ѵ�.
					int _t1 = intNum[i];
					intNum[i] = intNum[j];
					intNum[j] = _t1;
				}
			}
		}
		index=0;
		for(int num : intNum) {
		System.out.printf("%d : %d \t \n", num,intKor[index++]);
		}
	}
}
