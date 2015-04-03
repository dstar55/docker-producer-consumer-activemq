#pull base image
FROM dockerfile/java:oracle-java7

#maintainer 
MAINTAINER chris@chrisrichardson.net

#default command
CMD java -jar /data/consumer-0.1.0.jar

#copy hello world to docker image
ADD ./data/consumer-0.1.0.jar /data/consumer-0.1.0.jar
