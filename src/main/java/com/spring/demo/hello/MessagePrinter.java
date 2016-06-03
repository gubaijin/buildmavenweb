package com.spring.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//标注为控制层组件
public class MessagePrinter {
	final private MessageService service;

    @Autowired//对成员变量、方法和构造函数进行标注，来完成自动装配的工作
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
