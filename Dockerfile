FROM openjdk:11
VOLUME /tmp
EXPOSE 13000
ADD ./target/testpaul-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]