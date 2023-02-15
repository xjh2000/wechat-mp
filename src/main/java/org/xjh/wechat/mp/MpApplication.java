package org.xjh.wechat.mp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * @author xjh
 */
@SpringBootApplication
@ConfigurationPropertiesScan("org.xjh.wechat.mp.config")
public class MpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpApplication.class, args);
    }
}
