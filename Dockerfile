FROM  eclipse-temurin:17
COPY target/gen.jar gen.jar
CMD ["java","-jar","gen.jar"]
