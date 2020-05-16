package com.example.easyops;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.security.RunAs;


@SpringBootTest
public class EasyopsApplicationTests {

	@Autowired
	MySvc mySvc;

	@Test
	public void addTest(){
		int res=mySvc.add(a=232,b=11);
		assert res==243;
	}

}
