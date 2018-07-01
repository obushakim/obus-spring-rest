package org.obus.test.obus_spring_ws_consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.obus.test.obus_spring_ws_consumer.controller.KaryawanController;
import org.obus.test.obus_spring_ws_consumer.service.IKaryawanService;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(
		value = KaryawanController.class,
		secure = false)
public class RestControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private IKaryawanService karyawanService;
	
	@Test
	public void getAllKaryawan() throws Exception  {
		Mockito.when(
				karyawanService.getAllKaryawan())
		.thenReturn(null);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/obus-test/karyawans")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result = (MvcResult) mockMvc.perform(requestBuilder).andReturn();
		System.out.println(result.getResponse());
		
		JSONAssert.assertEquals(null, result.getResponse().getContentAsString(), false);
	}
}
