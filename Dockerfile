FROM java:latest
MAINTAINER Leandro Perez Guatibonza
WORKDIR /opt/docker
ADD opt /opt
RUN ["chown", "-R", "daemon:daemon", "."]
USER daemon
EXPOSE 9000
ENTRYPOINT ["bin/play-java-aws-elastic-beanstalk"]
CMD []