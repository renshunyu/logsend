package com.asiainfo.logsend;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@SpringBootApplication
public class LogsendApplication {

	public static void main(String[] args) {
		Logger log =Logger.getLogger("LogsendApplication.class");
		//String driver;
		ApplicationContext ctx =  SpringApplication.run(LogsendApplication.class, args);

		String[] beanNames =  ctx.getBeanDefinitionNames();
		System.out.println("所以beanNames个数："+beanNames.length);
		for(String bn:beanNames){
			System.out.println(bn);
		}

		log.info("renshunyu");
		log.trace("qwefweasdf");
		log.debug("renshunyu");

		testpremeter jk = (testpremeter) ctx.getBean("testpremeter");
		System.out.println(jk.getJk().getUrl());

	}
}
