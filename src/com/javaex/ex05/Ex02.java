package com.javaex.ex05;

public class Ex02 {
	
	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		System.out.println(a.concat(b));
		//System.out.println(a+b);
		System.out.println(b.concat(a));
		//System.out.println(b+a);
		
		a = a.concat(b);
		System.out.println(a);
		
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("ab", "12");
		System.out.println(a);
		
		a = a.replace("12", "3456");
		System.out.println(a);
		
		String[] sArr = a.split(",");
		
		for(int i = 0 ; i <sArr.length ; i++) {
			System.out.println(sArr[i]);
		}
		//System.out.println(sArr[1]);
		
		
		String str = "Hello JAVA!";
		String result1 = str.substring(3);
		System.out.println(result1);
		
		String result2 = str.substring(1, 7);
		System.out.println(result2);
		
		char result3 = str.charAt(8);
		System.out.println(result3);
		
		char result4 = str.charAt(4);
		System.out.println(result4);
		
		
		System.out.println("-------------");
		
		
		
		
		
		
		
	}	
	

}
