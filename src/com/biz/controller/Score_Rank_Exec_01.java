package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class Score_Rank_Exec_01 {

	public static void main(String[] args) {

		// ScoreVO 클래스를 이용해서 10개의 배열을 생성하고
		// 번호는 순서대로 설정하고
		// 이름은 입력하지 않고
		// kor, eng, math 점수를 각각 난수로 생성해서 저장
		// 단, 점수는 51 ~ 100까지
		// 입력(저장된)값을 콘솔에서 확인하고
		// 총점과 평균을 계산해 봅시다.

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
		System.out.println("빅데이터반 성적처리");
		System.out.println("====================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("----------------------------------------------------");
		for (ScoreVO vo : sVOs) {
			System.out.printf("%s\t%3d\t%3d\t%3d\t%3d\t%4d\t%3d\n", vo.getNumber(), vo.getKor(), vo.getEng(),
					vo.getMath(), vo.getTotal(), vo.getAverage(), vo.getRank());
		}
		System.out.println("====================================================");
		
		// 총점을 기준으로 내림차순 정렬
		for(int i = 0; i < sVOs.length; i++) {
			for(int j = i+1; j <sVOs.length; j++) {
				// 부등호 방향 > : 오름차순 정렬
				// 부등호 방향 < : 내림차순 정렬
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
		
		// 석차를 추가한 후에 다시 학번 순으로 정렬
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
