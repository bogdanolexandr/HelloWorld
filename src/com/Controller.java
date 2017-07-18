package com;

public class Controller {

	private View view;
	private Reader reader;

	public Controller(Reader reader, View view) {
		this.reader = reader;
		this.view = view;
	}

	public void doProcess() {
		Model model = reader.getData();
		view.show(model);
	}

}
