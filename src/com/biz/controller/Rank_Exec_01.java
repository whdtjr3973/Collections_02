package com.biz.controller;

import java.util.Random;

public class Rank_Exec_01 {

	public static void main(String[] args) {

		/*
		 * int �迭 intKor�� 10�� �����ϰ�
		 * ������ ���� 51 ~ 100���� ������ �����ϰ�
		 * ���õ� �迭�� ���� �������� ������ �غ��ô�.
		 */
		
		int[] intKor = new int[10];
				
		Random rnd = new Random();
		
		// Random(����)�� �߻��Ͽ�
		// 51~100���� ���� ������ ä���
		for(int i = 0; i <intKor.length; i++) {
			intKor[i] = rnd.nextInt(50) + 51;
		}
		for(int i : intKor) {
			System.out.print(i + "\t");
		}
		System.out.println();
		/*
		 * ����(Random)�� ������������ ���� �����ϸ�
		 * ���� �ߺ����� �ʴ� ���� ���� ���� ������ ����
		 * ��ȣȭ���� Ư���� �뵵���� ������ϴ� ����, ����
		 * 
		 * ������ ��ǻ�Ϳ��� �����ϴ� ������ ��ǻ�� ���ο��� Ư���� ������ ����
		 * ������ �ϴٺ��� ������ ������ ��Ÿ����.
		 * �׷��� ��ǻ�Ϳ��� ������ ������ ���糭�� ��� �θ���,
		 * �������� �뵵�θ� ����ؾ��Ѵ�.
		 */
		for(int i = 0 ; i < intKor.length; i++) {
			for(int j = i+1; j<intKor.length; j++) {
				if (intKor[i]>intKor[j]) {
					int _t = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _t;
				} 
			}
		}
		for (int i : intKor) {
			System.out.print(i+"\t");
		}
	}

}
