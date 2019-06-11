package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class Score_Exec_04 {

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
	}

}
