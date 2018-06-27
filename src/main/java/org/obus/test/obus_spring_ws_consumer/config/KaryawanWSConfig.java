package org.obus.test.obus_spring_ws_consumer.config;

import org.obus.test.obus_spring_ws_consumer.ws_client.KaryawanClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class KaryawanWSConfig {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("org.obus.test.obus_spring_ws");

		return marshaller;
	}

	@Bean
	public KaryawanClient karyawanClient(Jaxb2Marshaller marshaller) {
		KaryawanClient client = new KaryawanClient();
		client.setDefaultUri("http://localhost:6969/obus");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		
		return client;
	}
}
