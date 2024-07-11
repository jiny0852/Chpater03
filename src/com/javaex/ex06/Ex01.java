package com.javaex.ex06;

public class Ex01 {
	
	public static void main(String[] args) {
		
		int a = 3;
		System.out.println(a);
		
		Integer i = new Integer(3);
		System.out.println(i.toString());
		
		Integer sum = new Integer(3) + new Integer(5);
		System.out.println(sum);
		
		System.out.println("----------------");
		//문자열 --> 정수
		
		//덜 좋은 방식
		Integer r1 = 100; //자동 박싱
		int result = r1.parseInt("1234567");
		System.out.println(result);
		System.out.println(result + 3);
		
		//조금더 좋은 방식 static 이해
		int r2 = Integer.parseInt("456789123");
		System.out.println(r2);
		
		//정수 --> 문자열
		String s99 = String.valueOf(5555);
		System.out.println(s99);
		System.out.println(s99+5);
		
		String s100 = ""+5555;
		
		System.out.println(s100 + 9);
		
		
		
	}
	

}
