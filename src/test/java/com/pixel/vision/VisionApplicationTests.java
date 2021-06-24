package com.pixel.vision;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class VisionApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getDayFromGivenDate() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/calendar/day")
				.param("date", "06/24/2021")
				.contentType("application/json"))
				.andExpect(status().isOk())
				.andExpect(content().json("{'day':'175','dayOfWeek':'THURSDAY'}"));
	}
}
