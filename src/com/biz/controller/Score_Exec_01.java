package com.biz.controller;

import com.biz.model.ScoreVO;

public class Score_Exec_01 {

	public static void main(String[] args) {

		// ScoreVO Ŭ������ �̿��ؼ� sVO ��ü�� ����
		
		// ScoreVO Ŭ������ �̿��ؼ� sVO ��ü�� ����
		//			sVO��ü�� ����Ҽ� �ֵ��� �ʱ�ȭ
		ScoreVO sVO = new ScoreVO();
		
		// sVO�� ���� ����
		sVO.setNumber("1");
		sVO.setName("ȫ�浿");
		sVO.setKor(90);
		sVO.setEng(80);
		sVO.setMath(88);

		
		// sVO�� �ʵ忡 ������ �� ����Ǿ����� Ȯ�� - �����
		System.out.println(sVO.getNumber());
		System.out.println(sVO.getName());
		System.out.println(sVO.getKor());
		System.out.println(sVO.getEng());
		System.out.println(sVO.getMath());
		
		System.out.println(sVO.getTotal());
		
		System.out.println(sVO.toString());
	}

}
