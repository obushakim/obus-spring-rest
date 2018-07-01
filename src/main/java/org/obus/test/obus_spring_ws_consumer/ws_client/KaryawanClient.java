package org.obus.test.obus_spring_ws_consumer.ws_client;

import org.obus.test.obus_spring_ws.AddKaryawanRequest;
import org.obus.test.obus_spring_ws.AddKaryawanResponse;
import org.obus.test.obus_spring_ws.GetAllKaryawanRequest;
import org.obus.test.obus_spring_ws.GetAllKaryawanResponse;
import org.obus.test.obus_spring_ws.GetKaryawanRequest;
import org.obus.test.obus_spring_ws.GetKaryawanResponse;
import org.obus.test.obus_spring_ws.KaryawanInfo;
import org.obus.test.obus_spring_ws.RemoveKaryawanRequest;
import org.obus.test.obus_spring_ws.RemoveKaryawanResponse;
import org.obus.test.obus_spring_ws.UpdateKaryawanRequest;
import org.obus.test.obus_spring_ws.UpdateKaryawanResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Component
public class KaryawanClient extends WebServiceGatewaySupport {
	private static final Logger log = LoggerFactory.getLogger(KaryawanClient.class);
	private String uri = "http://localhost:6969/obus";
	
	public GetKaryawanResponse getKaryawan(int id) {
		GetKaryawanRequest request = new GetKaryawanRequest();
		request.setId(id);

		log.info("Requesting Karyawan = " + id);

		GetKaryawanResponse response = (GetKaryawanResponse) getWebServiceTemplate()
				.marshalSendAndReceive(uri, request);

		return response;
	}
	
	public GetAllKaryawanResponse getAllKaryawan() {
		GetAllKaryawanRequest request = new GetAllKaryawanRequest();
		GetAllKaryawanResponse response = (GetAllKaryawanResponse) getWebServiceTemplate()
				.marshalSendAndReceive(uri, request);
		
		return response;
	}
	
	public AddKaryawanResponse addKaryawan(KaryawanInfo data) {
		AddKaryawanRequest request =  new AddKaryawanRequest();
		request.setKaryawanInfo(data);
		
		AddKaryawanResponse response = (AddKaryawanResponse) getWebServiceTemplate()
				.marshalSendAndReceive(uri, request);
		
		return response;
	}
	
	public UpdateKaryawanResponse updateKaryawan(KaryawanInfo data) {
		UpdateKaryawanRequest request = new UpdateKaryawanRequest();
		request.setKaryawanInfo(data);
		
		UpdateKaryawanResponse response = (UpdateKaryawanResponse) getWebServiceTemplate()
				.marshalSendAndReceive(uri, request);
		
		return response;
	}
	
	public RemoveKaryawanResponse deleteKaryawan(int id) {
		RemoveKaryawanRequest request = new RemoveKaryawanRequest();
		request.setId(id);
		
		RemoveKaryawanResponse response = (RemoveKaryawanResponse) getWebServiceTemplate()
				.marshalSendAndReceive(uri, request);
		
		return response;
	}
}
