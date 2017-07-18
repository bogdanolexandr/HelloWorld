package com;

public class Main {

	public static void main(String[] args) {

		View view = new View();
		Reader reader = new Reader(view);
		Controller controller = new Controller(reader, view);
		controller.doProcess();

	}

}
