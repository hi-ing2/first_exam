package com.hi.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("���� �̸��� �Է����ּ���.");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.println("���� ������ �Է����ּ���. (����  OR ���� )");
		String M = "����", F = "����";
		String gen = s.next();
		if (gen.equals(M))
			gen = "M";
		else if (gen.equals(F))
			gen = "F";
		else
			gen = "none";
		System.out.println("���� �̸����� �Է����ּ���.");
		String email = s.next();
		System.out.println("���� �¾ ������ �Է����ּ���.");
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
		return "�̸�: " + name + ", ����: " + gen + ", �̸���: " + email + ", �¾ ����: " + year;
	}
}