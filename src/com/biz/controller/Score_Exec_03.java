package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class Score_Exec_03 {

	public static void main(String[] args) {

		// ScoreVO Ŭ������ �̿��ؼ� 10���� �迭�� �����ϰ�
		// ��ȣ�� ������� �����ϰ�
		// �̸��� �Է����� �ʰ�
		// kor, eng, math ������ ���� ������ �����ؼ� ����
		// ��, ������ 51 ~ 100����
		// �Է�(�����)���� �ֿܼ��� Ȯ���ϰ�
		// ������ ����� ����� ���ô�.

		Random rnd = new Random();

		ScoreVO[] sVOs = new ScoreVO[10];
		for (int i = 0; i < sVOs.length; i++) {

			sVOs[i] = new ScoreVO();
			// num �ʵ带 private���� �����߱⶧����
			// sVOs[i].number �ڵ�� ���Ұ�

			// number�ʵ�� String���ε� i���� int���̴� == sVOs[i].setNumber(i); <=�����߻�
			// ���� nuber�ʵ忡 ���� �����ϱ� ���ؼ���
			// int���� String ������ ��ȯ���Ѿ� �Ѵ�.
			// ������ �ڹ� ���� ����
			// sVOs[i].setNumber(Integer.toString(i + 1));
			// ���ڿ� + ������ �� ���ڿ� ����� �Ѵ�.
			sVOs[i].setNumber("" + (i + 1)); // "" �� ���ڿ� i+1�� int�� i+1�� ���������ϵ��� ()�̿�

			int intkor = rnd.nextInt(50) + 51;
			int inteng = rnd.nextInt(50) + 51;
			int intmath = rnd.nextInt(50) + 51;
			// ���� ������ �������ʰ� rnd.nextInt(50)+51;�� �ִ� ���������

			sVOs[i].setKor(intkor);
			sVOs[i].setEng(inteng);
			sVOs[i].setMath(intmath);

			// ���� ������ ������� ��� int intTotal = intkor + inteng + intmath ; ��밡��
			
//			int intTotal = intkor
//			intTotal += inteng
//			intTotal += intmath
			
			int intTotal = sVOs[i].getKor();
			intTotal += sVOs[i].getEng();
			intTotal += sVOs[i].getMath();

			sVOs[i].setTotal(intTotal);
			sVOs[i].setAverage(intTotal / 3);

			System.out.println(sVOs[i].toString());
		}
		// ������ ������ ���
		// for (ScoreVO vo : sVOs){
		//		int intkor = vo.getKor();
		//		int inteng = vo.getEng();
		//		int intmath = vo.getMath();
		//	}
		//	for(ScoreVO vo : sVOs){
		// 		System.out.println(sVOs.toString());
		//}
	}

}
