package com;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.capg.Calculateservice;
import com.capg.Calculator;

public class apptest {
static Calculator calculator=null;
Calculateservice service=new mockito.mock(Calculateservice.class);
@Before
public  void beforeclass() {
	calculator=new Calculator(service);
	System.out.println("before");
}
@Test
public void testadd() {
	
	System.out.println("testing add method");
	when(service.operation(2, 3)).thenReturn(5);
	assertEquals(10,calculator.operation(2,3));
}
}
