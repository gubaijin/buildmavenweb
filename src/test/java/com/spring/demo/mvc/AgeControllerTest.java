package com.spring.demo.mvc;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgeControllerTest {

	@Test
	public void testAge() {
		new AgeController().age("li", null);
	}

}
