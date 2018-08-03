package com.cg.test;

import com.cg.factory.MessageFactory;
import com.cg.renderer.MessageRenderer;

public class Test {

	public static void main(String[] args) {
		try {
			MessageRenderer renderer = MessageFactory.getMessageRenderer();
			renderer.render();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
