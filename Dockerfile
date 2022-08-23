FROM openjdk:18
EXPOSE 8080
ADD target/springboot-k8s-example-*.jar springboot-k8s-example.jar
ENTRYPOINT ["java","-jar","/springboot-k8s-example.jar"]