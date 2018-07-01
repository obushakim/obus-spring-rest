package org.obus.test.obus_spring_ws_consumer.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.obus.test.obus_spring_ws.KaryawanInfo;
import org.obus.test.obus_spring_ws_consumer.service.IKaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/karyawansdua")
public class KaryawanDuaController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	IKaryawanService karyawanService;

	@RequestMapping(
			value="/{id}", 
			method=RequestMethod.GET
	)
	public KaryawanInfo karyawanPathVariableDua(
			@PathVariable("id") int id) {
		
		return karyawanService.getKaryawan(id);
	}
	
	@RequestMapping(
			params = {"id"},
			method = RequestMethod.GET
	)
	@ResponseBody
	public KaryawanInfo karyawanParamDua(
			@RequestParam(value="id") int id) {
		
		return karyawanService.getKaryawan(id);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<KaryawanInfo> getAllKaryawanDua() {
		
		return karyawanService.getAllKaryawan();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public String addKaryawanDua(
			@RequestBody KaryawanInfo karyawan) {
		
		return karyawanService.addKaryawan(karyawan);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseBody
	public String updateKaryawanDua(
			@RequestBody KaryawanInfo karyawan) {
		
		return karyawanService.updateKaryawan(karyawan);
	}
	
	@RequestMapping(
			method = RequestMethod.DELETE,
			params = {"id"})
	@ResponseBody
	public String deleteKaryawanDua(
			@RequestParam(value="id") int id) {
		
		return karyawanService.removeKaryawan(id);
	}
}
