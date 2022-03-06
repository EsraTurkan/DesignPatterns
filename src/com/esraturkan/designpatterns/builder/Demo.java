package com.esraturkan.designpatterns.builder;

public class Demo {
	
	public static void main(String[] args) {

		Student student = new Student.Builder().number(123).name("Esra T�rkan").faculty("Bilgisayar M�hendisli�i")
				.degree("Y�ksek Lisans").build();

		System.out.println(student.toString());
	}
}
