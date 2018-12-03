package com.manoj.rabbitmqspike;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RecieverOne {

    public void receive() throws IOException, TimeoutException, InterruptedException {

      /*  Connection conn = BrokerConnection.getConnection();

        if (conn != null) {
            Channel channel = conn.createChannel();

            Consumer consumer = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message = new String(body, "UTF-8");
                    System.out.println("Time :" + System.currentTimeMillis() + " Message Received Queue 1 '" + message + "'");
                }
            };

            channel.basicConsume(FanoutExchange.QUEUE_NAME_1,true, consumer);


            System.out.println( channel.messageCount(FanoutExchange.QUEUE_NAME_1));

            Consumer consumer1 = new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message = new String(body, "UTF-8");
                    System.out.println("Time :" + System.currentTimeMillis() + " Message Received Queue 2 '" + message + "'");
                }
            };

            channel.basicConsume(FanoutExchange.QUEUE_NAME_2,true, consumer1);
            channel.close();


            conn.close();

        } */

    }
}
