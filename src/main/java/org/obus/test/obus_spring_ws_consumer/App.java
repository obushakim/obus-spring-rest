package org.obus.test.obus_spring_ws_consumer;

import org.obus.test.obus_spring_ws.GetKaryawanResponse;
import org.obus.test.obus_spring_ws_consumer.ws_client.KaryawanClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App {
	
	public static void main( String[] args ) {
		
		SpringApplication.run(App.class, args);
		
		// test doang, apus aja
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("org.obus.test.obus_spring_ws");
		KaryawanClient client = new KaryawanClient();
		client.setDefaultUri("http://localhost:6969/obus");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		
		System.out.println("66666666666666666666666666666666666666666666666666666666666666666666666666666666666666");
		GetKaryawanResponse response = client.getKaryawan(1);
		System.out.println("nama" + response.getKaryawanInfo().getName());
		// ampe sini
	}

	@Bean
	CommandLineRunner lookup(KaryawanClient client) {
		return args -> {
			String ticker = "MSFT";

			if (args.length > 0) {
				ticker = args[0];
			}
			GetKaryawanResponse response = client.getKaryawan(2);

			System.out.println("nama" + response.getKaryawanInfo().getName());
		};
	}
	
	@Bean
	GetKaryawanResponse getKaryawanResponse(KaryawanClient client) {
		System.out.println("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
		GetKaryawanResponse response = client.getKaryawan(1);
		System.out.println("nama" + response.getKaryawanInfo().getName());
		
		return response;
	}
}
