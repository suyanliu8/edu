package com.gloomyfish.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gloomyfish.edu.plugin.IPluginDemoService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DemoService{
	
	@Autowired(required = false)
	private IPluginDemoService pluginDemoService;
	
	public void demo() {
		if (log.isDebugEnabled()) {
			log.debug("demo ");
		}
		pluginDemoService.sendSms("1330101010101", "a" , "b");
	}

}
