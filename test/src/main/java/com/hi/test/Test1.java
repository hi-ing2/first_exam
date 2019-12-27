package com.hi.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("고객의 이름을 입력해주세요.");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.println("고객의 성별을 입력해주세요. (남자  OR 여자 )");
		String M = "남자", F = "여자";
		String gen = s.next();
		if (gen.equals(M))
			gen = "M";
		else if (gen.equals(F))
			gen = "F";
		else
			gen = "none";
		System.out.println("고객의 이메일을 입력해주세요.");
		String email = s.next();
		System.out.println("고객의 태어난 연도를 입력해주세요.");
		int year = s.nextInt();
		product p = new product();
		p.name = name;
		p.gen = gen;
		p.email = email;
		p.year = year;
		System.out.println(p);

	}
}

class product {
	String name;
	String gen;
	String email;
	int year;

	@Override
	public String toString() {
		return "이름: " + name + ", 성별: " + gen + ", 이메일: " + email + ", 태어난 연도: " + year;
	}
}