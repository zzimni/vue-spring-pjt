FROM openjdk:17-alpine

ARG JAR_FILE=build/libs/*.jar
copy ${JAR_FILE} backend.jar

# 환경 바꾸는 것 
ENTRYPOINT [ "java", "-jar", "/backend.jar" ]