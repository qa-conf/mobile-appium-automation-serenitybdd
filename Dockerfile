FROM jenkins/jenkins:lts-jdk17

USER root

RUN apt-get update && \
    apt-get install -y gradle adb && \
    apt-get clean

USER jenkins
