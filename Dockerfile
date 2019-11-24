FROM tomcat:jdk8-adoptopenjdk-openj9
MAINTAINER samykerdjou
ADD retwisj.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
