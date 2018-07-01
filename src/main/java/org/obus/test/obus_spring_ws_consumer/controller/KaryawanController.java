package org.obus.test.obus_spring_ws_consumer.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.obus.test.obus_spring_ws.KaryawanInfo;
import org.obus.test.obus_spring_ws_consumer.service.IKaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/karyawans")
public class KaryawanController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private static final String baseURI = "/karyawans";
	
	@Autowired
	IKaryawanService karyawanService;

	@GetMapping("{id}")
	public KaryawanInfo KaryawanPathVariable(
			@PathVariable("id") Integer id) {


		return karyawanService.getKaryawan(id);
	}
	
	
	@GetMapping
	public List<KaryawanInfo> getAllKaryawan() {
		
		return karyawanService.getAllKaryawan();
	}
	
	@PostMapping
	public String addKaryawan(
			@RequestBody KaryawanInfo karyawan) {
		
		return karyawanService.addKaryawan(karyawan);
	}
	
	@PutMapping("{id}")
	public String updateKaryawan(
			@PathVariable("id") Integer id,
			@RequestBody KaryawanInfo karyawan) {
		karyawan.setId(id);
		
		return karyawanService.updateKaryawan(karyawan);
	}
	
	@DeleteMapping(params = {"id"})
	public String deleteKaryawan(
			@RequestParam(value="id") Integer id) {
		
		return karyawanService.removeKaryawan(id);
	}
	
	public int tambah(int a, int b) {
		return a+b;
	}
}
