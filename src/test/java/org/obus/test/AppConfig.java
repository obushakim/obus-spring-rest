package org.obus.test;

import org.obus.test.obus_spring_ws_consumer.service.IKaryawanService;
import org.obus.test.obus_spring_ws_consumer.service.KaryawanService;
import org.obus.test.obus_spring_ws_consumer.ws_client.KaryawanClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public IKaryawanService karyawanService() {
		return new KaryawanService();
	} 
	
	@Bean
	public KaryawanClient karyawanClient() {
		return new KaryawanClient();
	}
}
