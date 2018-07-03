package org.obus.test.obus_spring_ws_consumer.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.obus.test.obus_spring_ws.KaryawanInfo;
import org.obus.test.obus_spring_ws_consumer.App;
import org.obus.test.obus_spring_ws_consumer.service.IKaryawanService;
import org.obus.test.obus_spring_ws_consumer.service.KaryawanService;
import org.obus.test.obus_spring_ws_consumer.ws_client.KaryawanClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@Configuration
class AppConfig {
	@Bean
	public IKaryawanService karyawanService() {
		return new KaryawanService();	
	} 
	
	@Bean
	public KaryawanClient karyawanClient() {
		return new KaryawanClient();
	}
}

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
//	locations = {
//			"classpath*:/application-context.xml"
//	}
	classes = {
			AppConfig.class
//			, App.class
}
	, loader = AnnotationConfigContextLoader.class
)
public class KaryawanControllerTest {
	
	@Autowired		
	IKaryawanService karyawanService;
	

//	public void setKaryawanService(KaryawanService karyawanService) {
//		this.karyawanService = karyawanService;
//	}
	
//	@Ignore
	@Test
	public void tambahTest() {
		KaryawanController karyawan =  new KaryawanController();
		KaryawanInfo karyawanInfo = new KaryawanInfo();
		karyawanInfo.setId(1);
		karyawanInfo.setName("obus");
		
		assertEquals(3, karyawan.tambah(1,2));
	}
	
	@Test
	public void kaliTest() {
		assertEquals(6, karyawanService.kali(2,3));
	}
}
