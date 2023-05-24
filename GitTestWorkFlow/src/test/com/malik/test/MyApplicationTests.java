package com.malik.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.malik.userdetails.Person;

class MyApplicationTests {

	@Test
	void echoNameTest() {
//		fail("Not yet implement?ed");
		String name = "Mansoor";
		String message = "Name is: " + name;
		
		Person p1 = new Person();
				
		assertTrue(message, p1.echoName(name).equalsIgnoreCase(name));
		
	}

}
