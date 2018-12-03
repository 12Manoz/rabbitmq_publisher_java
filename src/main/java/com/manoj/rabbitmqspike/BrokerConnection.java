package com.manoj.rabbitmqspike;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class BrokerConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
          //  factory.setPort(15672);
            factory.setUsername("guest");
            factory.setPassword("guest");
           // factory.setVirtualHost("rabbit@cd5a322fd303");
            conn = factory.newConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
