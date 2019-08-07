package com.dpt.alipaydemo.service;

import com.alipay.api.AlipayApiException;
import com.dpt.alipaydemo.component.Alipay;
import com.dpt.alipaydemo.model.AlipayBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 支付接口实现
 * @author dengpengtao
 * @date 2019/8/6
 */
@Service
public class PayServiceImpl implements PayService {

    @Autowired
    private Alipay alipay;

    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        return alipay.pay(alipayBean);
    }

}
