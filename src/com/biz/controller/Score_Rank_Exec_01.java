package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class Score_Rank_Exec_01 {

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

			sVOs[i].setNumber("" + (i + 1));

			int intkor = rnd.nextInt(50) + 51;
			int inteng = rnd.nextInt(50) + 51;
			int intmath = rnd.nextInt(50) + 51;

			sVOs[i].setKor(intkor);
			sVOs[i].setEng(inteng);
			sVOs[i].setMath(intmath);

			int intTotal = intkor;
			intTotal += inteng;
			intTotal += intmath;

			sVOs[i].setTotal(intTotal);
			sVOs[i].setAverage(intTotal / 3);

			System.out.println(sVOs[i].toString());
		}

		System.out.println("====================================================");
		System.out.println("�����͹� ����ó��");
		System.out.println("====================================================");
		System.out.println("�й�\t����\t����\t����\t����\t���\t����");
		System.out.println("----------------------------------------------------");
		for (ScoreVO vo : sVOs) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%4d\t%3d\n", vo.getNumber(), vo.getKor(), vo.getEng(),
					vo.getMath(), vo.getTotal(), vo.getAverage(), vo.getRank());
		}
		System.out.println("====================================================");
		
		// ������ �������� �������� ����
		for(int i = 0; i < sVOs.length; i++) {
			for(int j = i+1; j <sVOs.length; j++) {
				// �ε�ȣ ���� > : �������� ����
				// �ε�ȣ ���� < : �������� ����
				// if(sVOs[i].getTotal()> sVOs[j].getTotal()) {
				if(sVOs[i].getTotal()< sVOs[j].getTotal()) {
					ScoreVO _score = sVOs[i];
					sVOs[i] = sVOs[j];
					sVOs[j] = _score;
				}
			}
		}
		for(int i = 0 ; i < sVOs.length; i++) {
			sVOs[i].setRank(i+1); 
		}
		System.out.println("----------------------------------------------------");
		for (ScoreVO vo : sVOs) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%4d\t%3d\n", vo.getNumber(), vo.getKor(), vo.getEng(),
					vo.getMath(), vo.getTotal(), vo.getAverage(), vo.getRank());
		}
		System.out.println("====================================================");
		
		// ������ �߰��� �Ŀ� �ٽ� �й� ������ ����
		for(int i = 0; i < sVOs.length; i++) {
			for(int j = i+1; j <sVOs.length; j++) {
				if(Integer.valueOf(sVOs[i].getNumber())> Integer.valueOf(sVOs[j].getNumber())) {
					ScoreVO _score = sVOs[i];
					sVOs[i] = sVOs[j];
					sVOs[j] = _score;
				}
			}
		}
		System.out.println("----------------------------------------------------");
		for (ScoreVO vo : sVOs) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%4d\t%3d\n", vo.getNumber(), vo.getKor(), vo.getEng(),
					vo.getMath(), vo.getTotal(), vo.getAverage(), vo.getRank());
		}
		System.out.println("====================================================");
		
	}

}
