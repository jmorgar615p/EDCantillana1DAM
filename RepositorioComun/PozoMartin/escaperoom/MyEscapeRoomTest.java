package escaperoom;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MyEscapeRoomTest extends TestCase {
	
	//test constructor
	public void testMyEscapeRoom() {
		MyEscapeRoom mer = new MyEscapeRoom("Test");
		
		assertEquals("Test", mer.nombre);
		
		assertTrue(mer.sesion instanceof ArrayList);
		assertTrue(mer.cliente instanceof ArrayList);
	}
}
