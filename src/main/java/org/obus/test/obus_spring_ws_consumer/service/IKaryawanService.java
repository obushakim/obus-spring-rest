package org.obus.test.obus_spring_ws_consumer.service;

import java.util.List;

import org.obus.test.obus_spring_ws.KaryawanInfo;

public interface IKaryawanService {
	public KaryawanInfo getKaryawan(int id);
	public List<KaryawanInfo> getAllKaryawan();
	public String addKaryawan(KaryawanInfo data);
	public String updateKaryawan(KaryawanInfo data);
	public String removeKaryawan(int id);
}
