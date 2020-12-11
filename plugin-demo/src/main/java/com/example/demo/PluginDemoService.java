package com.example.demo;

import org.springframework.stereotype.Service;

import com.gloomyfish.edu.plugin.IPluginDemoService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PluginDemoService implements IPluginDemoService{

	@Override
	public Boolean sendSms(String phone, String... params) {
		if (log.isDebugEnabled()) {
			log.debug("%s %s",phone,params);
		}
		return true;
	}

}
