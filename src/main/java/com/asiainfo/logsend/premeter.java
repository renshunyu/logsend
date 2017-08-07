package com.asiainfo.logsend;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.support.ObjectNameManager;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/2.
 */
@Component
@ConfigurationProperties(prefix = "datasource")
public class premeter {
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
