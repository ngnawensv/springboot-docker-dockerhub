FROM  openjdk:17
EXPOSE 8080
ADD target/springboot-docker-dockerhub.jar  springboot-docker-dockerhub.jar
ENTRYPOINT ["java","-jar","springboot-docker-dockerhub.jar"]