package org.obus.test.obus_spring_ws_consumer.service;

import java.util.List;

import org.obus.test.obus_spring_ws.GetAllKaryawanResponse;
import org.obus.test.obus_spring_ws.GetKaryawanResponse;
import org.obus.test.obus_spring_ws.KaryawanInfo;
import org.obus.test.obus_spring_ws_consumer.ws_client.KaryawanClient;
import org.springframework.beans.BeanUtils;
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

	@Override
	public List<KaryawanInfo> getAllKaryawan() {
		// TODO Auto-generated method stub
		GetAllKaryawanResponse result = client.getAllKaryawan();
		List<KaryawanInfo> karyawans = result.getKaryawanList();
		
		return karyawans;
	}

	@Override
	public String addKaryawan(KaryawanInfo data) {
		// TODO Auto-generated method stub
		String result = client.addKaryawan(data).getResponseStatus();
		
		return result;
	}

	@Override
	public String updateKaryawan(KaryawanInfo data) {
		// TODO Auto-generated method stub
		String result = client.updateKaryawan(data).getResponseStatus();
		
		return result;
	}

	@Override
	public String removeKaryawan(int id) {
		// TODO Auto-generated method stub
		String result = client.deleteKaryawan(id).getResponseStatus();
		return result;
	}

}
