package edu.spring.boot.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.spring.boot.model.SolarSystem;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SolarSystemServiceTest {

	@Autowired
	private SolarSystemService service;

	@Test
	public void testGetInformationTest() {
		SolarSystem record = service.getInformation();
		assertTrue("Incorrect", record.getLocated().equalsIgnoreCase("Milky Way"));
		System.out.println(record);
	}
}
