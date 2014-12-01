package com.zephy.testing.tests;
import static org.junit.Assert.*;

import com.zephy.canyonbunny.game.*;
import com.zephy.testing.GdxTestRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(GdxTestRunner.class)
public class WorkingTests {

	@Test
	public void test() {
		WorldController wc = new WorldController();
		assertTrue(wc.ITrue());
	}
	


}
