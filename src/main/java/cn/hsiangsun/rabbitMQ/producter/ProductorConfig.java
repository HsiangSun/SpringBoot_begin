package cn.hsiangsun.rabbitMQ.producter;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductorConfig {
    //交换器名称
    public static final String ITEM_EXCHANGE = "item_exchange";
    //队列名称
    public static final String ITEM_QUEUE = "item_queue";
    //声明交换器
    @Bean("rabbitExchange")
    public Exchange itemExchange(){
        return ExchangeBuilder.topicExchange(ITEM_EXCHANGE).durable(true).build(); //durable 是否持久化
    }
    //声明队列
    @Bean("rabbitQueue")
    public Queue itemQueue(){
        return QueueBuilder.durable(ITEM_QUEUE).build();
    }
    //队列绑定到交换器
    @Bean
    public Binding bindQueueToExchange(@Qualifier("rabbitExchange") Exchange exchange,@Qualifier("rabbitQueue") Queue queue){
        return BindingBuilder.bind(queue).to(exchange).with("item.#").noargs(); //绑定含有item的路由
    }

}
