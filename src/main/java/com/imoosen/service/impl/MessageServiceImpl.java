package com.imoosen.service.impl;

import com.imoosen.service.IMessageService;
import org.springframework.stereotype.Service;

/**
 * @Description: [一句话描述该类的功能]
 * @Author: mengs
 * @Date: 2018/12/29
 * @Version: 1.0
 */
@Service
public class MessageServiceImpl implements IMessageService {
    @Override
    public String getMessage() {
        return "Hello World spring 5.0";
    }
}
