FROM openjdk:17

EXPOSE 4041

COPY target/sb-MySQL-app.war sb-MySQL-app.war

ENTRYPOINT ["java","-jar","/sb-MySQL-app.war"]