package com.biz.model;

/*
 * VO : Value Object Ŭ����
 * 
 * �� ��ü(�������� ����)�� �����͸� �����ؼ�
 * �޼��尣, Ŭ�������� �̵��Ҷ� �ٱ���ó��
 * ����ϴ� Ŭ����
 * 
 * DTO(Data Transfer Object)
 */
public class ScoreVO {
	
	/*
	 * vo ���� Ư¡
	 * 1. �������(�ʵ�)�� �� �ʿ��� �뵵�� �ƴϸ� ��ü�� 
	 * 	  private���� ������ �Ѵ�.
	 * 2. ��������� �ܺο��� ����(����,�б�)�Ҽ� �ֵ���
	 * 	  getter��  setter �޼��带 �����ؼ� ����Ѵ�.
	 * 	  == �������� ����(���߱�)�ؼ� �����͸� ��ȣ�ϴ� ����
	 * 3. toString �޼��带 �� ����(Override)�ؼ�
	 * 	  �ʵ忡 ����� ���� �ܺο��� Ȯ���Ҽ� �ֵ��� �Ѵ�.
	 */
	private String number;  // strNumber
	private String name; 	// strName
	private int Kor; 		// intKor
	private int Eng; 		// intEng
	private int Math; 		// intMath

	private int Total;
	private int Average;
	private int Rank;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	public int getMath() {
		return Math;
	}
	public void setMath(int math) {
		Math = math;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public int getAverage() {
		return Average;
	}
	public void setAverage(int average) {
		Average = average;
	}
	public int getRank() {
		return Rank;
	}
	public void setRank(int rank) {
		Rank = rank;
	}
	
	// toString()�� ���� Object Ŭ������ ���ǵǾ� �ִ� method�̸�
	// ��ü�� ����� �޸� �ּҸ� �˷��ִ� method�̴�
	// �� method�� �� �ʵ��� ���� Ȯ�ν����ִ� �뵵�� ����
	@Override
	public String toString() {
		return "ScoreVO [number=" + number + ", name=" + name + ", Kor=" + Kor + ", Eng=" + Eng + ", Math=" + Math
				+ ", Total=" + Total + ", Average=" + Average + ", Rank=" + Rank + "]";
	}
	
}
