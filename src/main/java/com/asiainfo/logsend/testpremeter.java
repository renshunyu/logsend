package com.asiainfo.logsend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/5.
 */
@Component
public class testpremeter {
    @Autowired
    private premeter jk;

    public premeter getJk() {
        return jk;
    }
}
