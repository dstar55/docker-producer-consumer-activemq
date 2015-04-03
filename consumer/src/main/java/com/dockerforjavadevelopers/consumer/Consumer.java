package com.dockerforjavadevelopers.consumer;

import org.springframework.beans.factory.annotation.Autowired;

import com.dockerforjavadevelopers.service.IPreview;


public class Consumer {

	@Autowired
	private IPreview preview;

	public void receiveMessage(String message) {

		System.out.println("Message received : " +  message );
		
        preview.createPreview();        
    }
}
