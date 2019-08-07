package com.dpt.alipaydemo.service;

import com.alipay.api.AlipayApiException;
import com.dpt.alipaydemo.model.AlipayBean;

/**
 * 支付服务
 * @author dengpengtao
 * @date 2019/8/6
 */
public interface PayService {

    /**
     * 支付宝支付接口
     * @param alipayBean
     * @return
     */
    String aliPay(AlipayBean alipayBean) throws AlipayApiException;

}
