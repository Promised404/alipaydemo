package com.dpt.alipaydemo.controller;

import com.alipay.api.AlipayApiException;
import com.dpt.alipaydemo.model.AlipayBean;
import com.dpt.alipaydemo.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Order订单Controller
 * @author dengpengtao
 * @date 2019/8/6
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private PayService payService;

    @PostMapping("/alipay")
    public String alipay(String outTradeNo, String subject, String totalAmount, String body) throws AlipayApiException {
        AlipayBean alipayBean = new AlipayBean();
        alipayBean.setOut_trade_no(outTradeNo);
        alipayBean.setSubject(subject);
        alipayBean.setTotal_amount(totalAmount);
        alipayBean.setBody(body);
        return payService.aliPay(alipayBean);
    }

}
