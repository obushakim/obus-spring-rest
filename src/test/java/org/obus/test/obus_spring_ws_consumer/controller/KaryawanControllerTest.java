package org.obus.test.obus_spring_ws_consumer.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.obus.test.obus_spring_ws.KaryawanInfo;

import junit.framework.TestCase;

public class KaryawanControllerTest {
	@Test
	public void tambahTest() {
		KaryawanController karyawan =  new KaryawanController();
		KaryawanInfo karyawanInfo = new KaryawanInfo();
		karyawanInfo.setId(1);
		karyawanInfo.setName("obus");
		
		assertEquals(3, karyawan.tambah(1,2));
	}
}
