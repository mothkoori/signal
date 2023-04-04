# Signal application

This application exposes Rest endpoint to handle the signal.

## Software requirements:  
Java 8 is required.

Maven.

## How to run:  
```bash
    mvn spring-boot:run
```

Once above command runs successfully then application should run on port **8080**.
http://localhost:8080/signal/{signal}

Here {signal} is signal we want to handle.
### Example:
For example if you want to handle signal 1 then url will be like below.

http://localhost:8080/signal/1