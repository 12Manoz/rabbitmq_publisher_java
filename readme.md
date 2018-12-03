This is code example for rabbitmq publisher 

You can use this code to csutomize and test java client code to publish message to rabbitmq 

I have writtent code for fanout exchange type

Things to note down when you use fanout exchange type 

--- Fanout exchange you declare exchange name and type 
--- You declare binding to bind queue and exchange with routing key which is optional 
--- you use channel to publish message to the exchange here message is published to exhcnage and basicpublish message does not care about routing key value provided in the method 
-- when this code runs it will have routing key values in bind method but in publish method we put null so that broker will take care of delivering messages to the queues 
--- channel will publish the message to exchange 
--- when you subscribe the message subscriber cannot use direct or default exchange it needs to use same exchange type with same exchagne name and with same binding properties 
--- subscriber can consume from individual queues by providing queues name from the fanout exchange 

For details see the documentation i have added other repository that usages spring amqp to consume message from the fanout exchange 
