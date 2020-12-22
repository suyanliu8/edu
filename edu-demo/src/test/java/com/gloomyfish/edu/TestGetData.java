package com.gloomyfish.edu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
/*
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.mysql.cj.jdbc.Driver;
*/

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class TestGetData {
	@Test
	public void testGet() {
		MyTest vo = MyTest.builder().age(10).code("code").build();
		String str = DataFieldTools.objString(vo, "code");
		Integer age = DataFieldTools.objInteger(vo, "age");
		log.info(str);
		log.info(age.toString());
		Map map = new HashMap();
		map.put("name", "name2");
		map.put("money", 22.00);
		String name = DataFieldTools.objString(map, "name");
		String money = DataFieldTools.objString(map, "money");
		log.info(name);
		log.info(money.toString());

		String n1 = DataFieldTools.objString(null, "name");
		Integer m1 = DataFieldTools.objInteger(map, "dddd");
		log.info(n1);
		log.info(m1.toString());

	}
}

@Data
@Builder
class MyTest {
	private String code;
	private Integer age;
}
