package org.obus.test.obus_spring_ws_consumer.service;

import org.obus.test.obus_spring_ws.GetKaryawanResponse;
import org.obus.test.obus_spring_ws.KaryawanInfo;
import org.obus.test.obus_spring_ws_consumer.ws_client.KaryawanClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KaryawanService implements IKaryawanService {
	@Autowired
	KaryawanClient client;
	
	@Override
	public KaryawanInfo getKaryawan(int id) {
		// TODO Auto-generated method stub
		KaryawanInfo karyawan = client.getKaryawan(id).getKaryawanInfo();
		
		return karyawan;
	}

}
