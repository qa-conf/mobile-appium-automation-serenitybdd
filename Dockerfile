# Usamos la imagen oficial de Jenkins con JDK 17
FROM jenkins/jenkins:lts-jdk17

# Cambiamos al usuario root para poder instalar paquetes
USER root

# Actualizamos e instalamos herramientas necesarias: Gradle y adb.
# Nota: en distribuciones Linux basadas en Debian, la versión de Gradle vía apt puede ser antigua;
# en ese caso puedes optar por instalar Gradle manualmente o utilizar el Gradle Wrapper de tu proyecto.
RUN apt-get update && \
    apt-get install -y gradle adb && \
    apt-get clean

# Vuelve al usuario Jenkins
USER jenkins

# Opcional: puedes copiar algún script o configuración adicional aquí
