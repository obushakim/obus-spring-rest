package org.obus.test.obus_spring_ws_consumer.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.obus.test.obus_spring_ws.KaryawanInfo;
import org.obus.test.obus_spring_ws_consumer.service.IKaryawanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/karyawan")
public class KaryawanController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	IKaryawanService karyawanService;

	@RequestMapping(
			value="/{id}", 
			method=RequestMethod.GET
	)
	public KaryawanInfo greetingPathVariable(
			@PathVariable("id") int id) {
		
		return karyawanService.getKaryawan(id);
	}
	
	@RequestMapping(
			params = {"id"},
			method = RequestMethod.GET
	)
	@ResponseBody
	public KaryawanInfo greetingParam(
			@RequestParam(value="id") Integer id) {
		
		return karyawanService.getKaryawan(id);
	}
}
