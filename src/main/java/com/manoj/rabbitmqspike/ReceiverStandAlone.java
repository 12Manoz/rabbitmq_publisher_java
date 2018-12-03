package com.manoj.rabbitmqspike;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeoutException;

public class ReceiverStandAlone {
    public static void main (String [] args) throws IOException, TimeoutException {
        Connection conn = BrokerConnection.getConnection();

        if (conn != null) {
           Channel channel = conn.createChannel();

            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message = new String(body, "UTF-8");
                    System.out.println("Time :" + System.currentTimeMillis() + " Message Received Queue 2 standalone '" + message + "'");
                }
            };

            channel.exchangeDeclare(FanoutExchange.EXCHANGE_NAME,"fanout");
            channel.queueDeclare(FanoutExchange.QUEUE_NAME_1,true,false,false,new HashMap<>());

            channel.basicConsume(FanoutExchange.QUEUE_NAME_1,false, consumer);


            channel.close();
            conn.close();

        }

    }
}
