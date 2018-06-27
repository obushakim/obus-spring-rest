package org.obus.test.obus_spring_ws_consumer.ws_client;

import org.obus.test.obus_spring_ws.GetKaryawanRequest;
import org.obus.test.obus_spring_ws.GetKaryawanResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Component
public class KaryawanClient extends WebServiceGatewaySupport {
	private static final Logger log = LoggerFactory.getLogger(KaryawanClient.class);

	public GetKaryawanResponse getKaryawan(int id) {
		String uri = "http://localhost:6969/obus";
		GetKaryawanRequest request = new GetKaryawanRequest();
		request.setId(id);

		log.info("Requesting Karyawan = " + id);

		GetKaryawanResponse response = (GetKaryawanResponse) getWebServiceTemplate()
				.marshalSendAndReceive(uri, request);

		return response;
	}
}
