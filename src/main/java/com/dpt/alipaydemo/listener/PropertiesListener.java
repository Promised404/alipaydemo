package com.dpt.alipaydemo.listener;

import com.dpt.alipaydemo.proerties.AlipayProperties;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author dengpengtao
 * @date 2019/8/6
 * 配置文件监听器，用来加载自定义配置文件
 */
@Component
public class PropertiesListener implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        AlipayProperties.loadProperties();
    }

}
