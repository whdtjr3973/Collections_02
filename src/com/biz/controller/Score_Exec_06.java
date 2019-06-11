package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.model.ScoreVO;

public class Score_Exec_06 {

	public static void main(String[] args) {

		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 50 ; i++) {
			/*
			 * � Ŭ������ ��ü�� �����ؼ�
			 * List�� �߰��ϰ��� �Ҷ���
			 * ������ �����ϱ⿡ �ռ�
			 * �ݵ�� Ŭ������ ��ü�� (����)�����ؼ�
			 * ����ؾ� �Ѵ�.
			 */
			ScoreVO sVO = new ScoreVO();
			sVO.setNumber("" +(i+1));
			
			sVO.setKor(rnd.nextInt(50)+51);
			sVO.setEng(rnd.nextInt(50)+51);
			sVO.setMath(rnd.nextInt(50)+51);
			
			scList.add(sVO);
			
		}
		for(ScoreVO s : scList) {
			System.out.println(s.toString());
		}
		
		/*
		 * List�� ũ�⸦ �˼��ִ� method�� List.size()�� �ִµ�
		 * �� List.size() �޼���� ȣ���ҋ����� �Ź� List�� ������
		 * ����Ѵ�. ���� �迭�� length�ʹ� ������ �޶�
		 * for�� ������ ������ ������� ���� 
		 * for���� �����ϱ����� ������ ��Ƴ��� for���� �����ϴ�
		 * ���� ����.
		 */
		int scLen = scList.size();
		for(int i =0; i < scLen ; i++) {
			// scList�� i���� ��ġ�� ����� ScoreVO�� �ּҸ� �о
			// vo�� ��ƴ޶�
			ScoreVO vo = scList.get(i);
			
			int intTotal = vo.getKor() + vo.getEng() + vo.getMath();
			
			intTotal = scList.get(i).getKor();
			intTotal += scList.get(i).getEng();
			intTotal += scList.get(i).getMath();
			
			
			vo.setTotal(intTotal);
			vo.setAverage(intTotal/3);
			
			// build ����
			// scList�� �ּҸ� ���� �����Ͽ�
			// �ּҷκ��� Total ������ ��ġ�� �����
			// �� Total ������ ���� setting �϶�
			scList.get(i).setTotal(intTotal);;
		}
		
		scLen = scList.size();
		for(int i = 0 ; i < scLen; i++) {
			for(int j = i+1; j <scLen; j++) {
				ScoreVO v1 = scList.get(i);
				ScoreVO v2 = scList.get(i);
				if(v1.getTotal()>v2.getTotal()) {
					ScoreVO _score = scList.get(i);
					scList.set(i,v2);
					scList.set(j, _score);
				}
			}
		}
	}

}
