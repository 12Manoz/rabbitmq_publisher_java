package com.manoj.rabbitmqspike;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class FanoutExchange {

    public static String EXCHANGE_NAME = "exchange_type_fanout_test";
    public static String QUEUE_NAME_1 = "queue_name_test1";
    public static String QUEUE_NAME_2 = "queue_name_test2";

    public static String ROUTING_KEY = "";

    public void createExchangeAndQueue(){
        try{
            Connection conn = BrokerConnection.getConnection();

            if(conn != null){
                Channel  channel = conn.createChannel();
                channel.exchangeDeclare(EXCHANGE_NAME,"fanout",true);

                // add quque1
                channel.queueDeclare(QUEUE_NAME_1 , true , false,false,null);
                // add queue2
                channel.queueDeclare(QUEUE_NAME_2, true , false,false,null);

                channel.queueBind(QUEUE_NAME_1, EXCHANGE_NAME ,QUEUE_NAME_1);
                channel.queueBind(QUEUE_NAME_2, EXCHANGE_NAME ,QUEUE_NAME_2);

                channel.close();
                conn.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}