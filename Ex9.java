package javaapplication6;

import java.util.Scanner;

public class Ex9  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        for (int i=0; i < 50; i++) {
        	if (i % 2 != 0) {
        		System.out.println(i);
        	}
        }
	}
}