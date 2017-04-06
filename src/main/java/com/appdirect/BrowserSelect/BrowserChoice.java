package com.appdirect.BrowserSelect;

import java.util.Scanner;

public class BrowserChoice {
	
	public String BrowserSelection() {
		System.out.println("Enter your choice:");
		System.out.println("1.Chrome");
		System.out.println("2.Firefox");
		
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		if(choice == 1) {
			return "Chrome";
		}
		else {
			return "Firefox";
		}		
	}
}