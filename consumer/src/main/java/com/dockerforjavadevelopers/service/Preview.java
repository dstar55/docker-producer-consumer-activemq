package com.dockerforjavadevelopers.service;

public class Preview implements IPreview {


	public void createPreview() {
		// in order to simulate creation of the leanpub book preview sleep for 1 second
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Preview created");
	}

}
