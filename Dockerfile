FROM openjdk:12
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} EstadisticaDashboard.jar
ENTRYPOINT ["java","-jar","/EstadisticaDashboard.jar"]