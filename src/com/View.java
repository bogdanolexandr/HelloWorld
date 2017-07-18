package com;

public class View {

	public void show(Model model) {
		System.out.println(model.getMessage());
	}
	
	public void show(String string){
		System.out.println(string);
	}

}
