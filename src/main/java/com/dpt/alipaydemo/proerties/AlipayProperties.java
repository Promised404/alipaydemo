package com.dpt.alipaydemo.proerties;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author dengpengtao
 * @date 2019/8/6
 */
@Component
public class AlipayProperties {

    public static final String APP_ID = "appId";
    public static final String PRIVARY_KEY = "privateKey";
    public static final String PUBLIC_KEY = "publicKey";
    public static final String NOTIFY_URL = "notifyUrl";
    public static final String RETURN_URL = "returnUrl";
    public static final String SIGN_TYPE = "signType";
    public static final String CHARSET = "charset";
    public static final String GATEWAY_URL = "gatewayUrl";
    public static final String LOG_PATH = "logPath";

//    public static final String APP_ID = "appId";
//    public static final String PRIVARY_KEY = "privateKey";
//    public static final String PUBLIC_KEY = "publicKey";
//    public static final String NOTIFY_URL = "notifyUrl";
//    public static final String RETURN_URL = "returnUrl";
//    public static final String SIGN_TYPE = "signType";
//    public static final String CHARSET = "charset";
//    public static final String GATEWAY_URL = "gatewayUrl";
//    public static final String LOG_PATH = "logPath";

    /**
     * 保存加载配置参数
     */
    private static Map<String, String> propertiesMap = new HashMap<>();

    /**
     * 加载属性
     */
    public static void loadProperties() {
        // 获得PathMatchingResourcePatternResolver对象
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            Resource resource = resolver.getResource("classpath:alipay.properties");
            PropertiesFactoryBean config = new PropertiesFactoryBean();
            config.setLocation(resource);
            config.afterPropertiesSet();
            Properties properties = config.getObject();
            for (String key : properties.stringPropertyNames()) {
                propertiesMap.put(key, (String) properties.get(key));
            }
        } catch (IOException e) {
            System.err.println("配置文件加载失败");
            e.printStackTrace();
        }
    }

    /**
     * 获取配置参数值
     * @param key
     * @return
     */
    public static String getKey(String key) {
        return propertiesMap.get(key);
    }

    public static String getAppId() {
        return propertiesMap.get(APP_ID);
    }

    public static String getPrivateKey() {
        return propertiesMap.get(PRIVARY_KEY);
    }

    public static String getPublicKey() {
        return propertiesMap.get(PUBLIC_KEY);
    }

    public static String getNotifyUrl() {
        return propertiesMap.get(NOTIFY_URL);
    }

    public static String getReturnUrl() {
        return propertiesMap.get(RETURN_URL);
    }

    public static String getSignType() {
        return propertiesMap.get(SIGN_TYPE);
    }

    public static String getCharset() {
        return propertiesMap.get(CHARSET);
    }

    public static String getGatewayUrl() {
        return propertiesMap.get(GATEWAY_URL);
    }

    public static String getLogPath() {
        return propertiesMap.get(LOG_PATH);
    }



}
