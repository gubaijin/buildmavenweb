package com.spring.demo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Task {

	private static final Logger LOG = LoggerFactory.getLogger(Task.class);

	public void doCheck() {
		LOG.info("00000");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
