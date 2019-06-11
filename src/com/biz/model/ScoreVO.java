package com.biz.model;

/*
 * VO : Value Object 클래스
 * 
 * 한 객체(여러가지 정보)의 데이터를 저장해서
 * 메서드간, 클래스간에 이동할때 바구니처럼
 * 사용하는 클래스
 * 
 * DTO(Data Transfer Object)
 */
public class ScoreVO {
	
	/*
	 * vo 패턴 특징
	 * 1. 멤버변수(필드)는 꼭 필요한 용도가 아니면 대체로 
	 * 	  private으로 선언을 한다.
	 * 2. 멤버변수를 외부에서 접근(저장,읽기)할수 있도록
	 * 	  getter와  setter 메서드를 생성해서 사용한다.
	 * 	  == 데이터의 은닉(감추기)해서 데이터를 보호하는 목적
	 * 3. toString 메서드를 재 정의(Override)해서
	 * 	  필드에 저장된 값을 외부에서 확인할수 있도록 한다.
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
	
	// toString()은 원래 Object 클래스에 정의되어 있는 method이며
	// 객체가 저장된 메모리 주소를 알려주는 method이다
	// 이 method를 각 필드의 값을 확인시켜주는 용도로 변경
	@Override
	public String toString() {
		return "ScoreVO [number=" + number + ", name=" + name + ", Kor=" + Kor + ", Eng=" + Eng + ", Math=" + Math
				+ ", Total=" + Total + ", Average=" + Average + ", Rank=" + Rank + "]";
	}
	
}
