package cbt;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class CoreJava {
	@Test
	private void m1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num here :");
		int num = sc.nextInt();
		int c;
		for (int i = 1; i <= 10; i++) {
			c = num * i;
			System.out.println(c);

		}

	}

}
