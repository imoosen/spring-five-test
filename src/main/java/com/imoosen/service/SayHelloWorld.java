package com.imoosen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description: [一句话描述该类的功能]
 * @Author: mengs
 * @Date: 2018/12/29
 * @Version: 1.0
 */
@Component
public class SayHelloWorld {

    final private IMessageService messageService;

    @Autowired
    public SayHelloWorld(IMessageService messageService) {
        this.messageService = messageService;
    }

    public String Say(){
        return messageService.getMessage();
    }
}
