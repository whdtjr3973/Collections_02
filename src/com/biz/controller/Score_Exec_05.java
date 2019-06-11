package com.biz.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.model.ScoreVO;

public class Score_Exec_05 {

	public static void main(String[] args) {
		
		// �ϴ� ����ִ�(����Ʈ�� ����) �ڷᱸ��(Data Structure)�� �����ϰ�
		// �ʿ信 ���� ����(����Ʈ)�� �߰��ؼ� ����Ҽ� �ִ�
		// �ڹ��� ��Ư�� ���
		// �ڹ�1.8 �̻󿡼��� ���� �۵��ȴ�.
		//List scList = new ArrayList();
		
		// ȣȯ���� ���ؼ� ����ϴ� ǥ�ع���
		// 1. ScoreVO(����ǥ)�� ���� ����ִ� List�� ����
		List<ScoreVO> scList = new ArrayList<ScoreVO>();
		
		Random rnd = new Random();
		
		// 2. List�� ���� ���μ���ǥ�� �����ϰ� ���� ����
		// ȫ�浿 �л��� ���� ����ǥ ����, ���� ����
		ScoreVO sVO = new ScoreVO();
		sVO.setNumber("1");
		sVO.setName("ȫ�浿");
		sVO.setKor(rnd.nextInt(50)+51);
		sVO.setEng(rnd.nextInt(50)+51);
		sVO.setMath(rnd.nextInt(50)+51);
		
		// 3. ���μ���ǥ�� List�� �߰�
		// scList�� �߰��� �ؾ��Ѵ�.
		scList.add(sVO);
		
		// ������ �л��� ����ǥ�� �����ϰ� ���� ������ ��
		sVO = new ScoreVO();
		
		sVO.setNumber("2");
		sVO.setName("������");
		sVO.setKor(rnd.nextInt(50)+51);
		sVO.setEng(rnd.nextInt(50)+51);
		sVO.setMath(rnd.nextInt(50)+51);
		
		// scList�� �߰��� �Ѵ�.
		scList.add(sVO);
		
	}
}
