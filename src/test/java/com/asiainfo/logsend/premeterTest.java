package com.asiainfo.logsend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/5/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = premeter.class)
@Configuration
@EnableConfigurationProperties
public class premeterTest {
    @Autowired
    private premeter p;


    @Test
    public void getUrl() throws Exception {
        String url = p.getUrl();
        System.out.println(url);
        //assert "jdbc:oracle:thin:@10.15.42.37:1521:iap" == url;
        assertEquals("hhahhahha",url,"jdbc:oracle:thin:@10.15.42.37:1521:iap");

    }


}