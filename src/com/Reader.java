package com;

import java.util.Scanner;

public class Reader {

	private Scanner scanner = new Scanner(System.in);
	private View view ;
	
	public Reader(View view){
		this.view = view;
	}
	
	public Model getData() {

		String firstInput = null;
		String secondInput = null;

		while (true) {
			view.show("enter first parameter");
			firstInput = readString();
			if (verifyText(firstInput, "hello")) {
				view.show("enter second parameter");
				secondInput = readString();
				if (verifyText(secondInput, "world")) {
					return new Model(firstInput + " " + secondInput);
				} else {
					view.show("not correct second parameter");
					continue;
				}
			}
			view.show("not correct first parameter");
		}

	}

	private String readString() {
		return scanner.nextLine();
	}

	private boolean verifyText(String text, String neededText) {
		if (text.toUpperCase().equals(neededText.toUpperCase())) {
			return true;
		}
		return false;
	}

}
