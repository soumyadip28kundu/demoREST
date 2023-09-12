FROM openjdk:20
EXPOSE 8080
ADD /target/demoREST-0.0.1.jar demorestspringboot-v1.jar
ENTRYPOINT ["java","-jar","/demorestspringboot-v1.jar"]