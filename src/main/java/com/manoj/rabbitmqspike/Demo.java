package com.manoj.rabbitmqspike;

public class Demo {

    public static void main(String args[]) {
        try {
            FanoutExchange ex = new FanoutExchange();
            ex.createExchangeAndQueue();

            // Publish
            Publisher produce = new Publisher();
            produce.publish();

            // Consume
            RecieverOne recieverOne = new RecieverOne();
            recieverOne.receive();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}