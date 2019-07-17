package cn.hsiangsun.rabbitMQ.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Comsumer {

    @RabbitListener(queues = "item_queue")
    public void listener(String message){
        System.out.println("=====Message======"+message);
    }
}
