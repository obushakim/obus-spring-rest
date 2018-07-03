package org.obus.test.obus_spring_ws_consumer.service;

import java.util.List;

import org.obus.test.obus_spring_ws.KaryawanInfo;
import org.springframework.stereotype.Component;

public interface IKaryawanService {
	public KaryawanInfo getKaryawan(int id);
	public List<KaryawanInfo> getAllKaryawan();
	public String addKaryawan(KaryawanInfo data);
	public String updateKaryawan(KaryawanInfo data);
	public String removeKaryawan(int id);
	public int kali(int a, int b);
}
