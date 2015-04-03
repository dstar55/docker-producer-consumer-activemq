##Producer Consumer sample shows how to implement classical Producer Consumer Pattern using [SpringBoot](http://projects.spring.io/spring-boot/), [ActiveMQ](http://activemq.apache.org/) and how to deploy it with [Docker](https://www.docker.com/).
Scallability can be achieved by invoking more Consumer Docker images.

####Prerequisite

Installed: Docker, Java 1.7, Maven 3.x, ActiveMQ 5.x

####Steps

#####Clone source code from git
```
$ git clone https://github.com/dstar55/docker-for-java-developers .
```

#####Move to producer-consumer example
```
$ cd producer-consumer
```

####Build Producer

#####Move to Producer project
```
$ cd producer
```

#####Find IP address od the Docker host
```
$ ifconfig
```

#####Update `spring.activemq.broker-url` property in file `src/main/resources/application.properties` with IP address
```
$ spring.activemq.broker-url=tcp://172.17.42.1:61616
```

#####Build project with Maven
```
$ mvn clean install
```

#####Move application to data folder
```
$ mv ./target/producer*.jar ./data
```

#####Build Docker image
```
$ docker build -t="producer" .
```

####Build Consumer

#####Move to Consumer project
```
$ cd consumer
```

#####Find IP address od the Docker host
```
$ ifconfig
```

#####Update `spring.activemq.broker-url` property in file `src/main/resources/application.properties` with IP address
```
$ spring.activemq.broker-url=tcp://172.17.42.1:61616
```

#####Build project with Maven
```
$ mvn clean install
```

#####Move application to data folder
```
$ mv ./target/consumer*.jar ./data
```

#####Build Docker image
```
$ docker build -t="consumer" .
```

####Run Producer Consumer

#####Start ActiveMQ
```
$ /opt/activemq/bin/activemq start
```

