package com.biz.controller;

import java.util.Random;

import com.biz.model.ScoreVO;

public class Score_Exec_03 {

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
			// num 필드를 private으로 선언했기때문에
			// sVOs[i].number 코드는 사용불가

			// number필드는 String형인데 i값은 int형이다 == sVOs[i].setNumber(i); <=오류발생
			// 따라서 nuber필드에 값을 저장하기 위해서는
			// int형을 String 형으로 변환시켜야 한다.
			// 기존의 자바 전통 문법
			// sVOs[i].setNumber(Integer.toString(i + 1));
			// 문자열 + 숫자형 은 문자열 취급을 한다.
			sVOs[i].setNumber("" + (i + 1)); // "" 은 문자열 i+1은 int형 i+1를 먼저실행하도록 ()이용

			int intkor = rnd.nextInt(50) + 51;
			int inteng = rnd.nextInt(50) + 51;
			int intmath = rnd.nextInt(50) + 51;
			// 따로 변수를 만들지않고 rnd.nextInt(50)+51;를 넣는 방법도있음

			sVOs[i].setKor(intkor);
			sVOs[i].setEng(inteng);
			sVOs[i].setMath(intmath);

			// 따로 변수를 만들었을 경우 int intTotal = intkor + inteng + intmath ; 사용가능
			
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
		// 총점을 별도로 계산
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
