# Proyecto de Automatización Mobile Android - iOS

Este repositorio contiene un proyecto de automatización mobile para Android e iOS usando Appium, SerenityBDD, Java 17, Gradle y JUnit5.

## Propósito de las Ramas

### `main`
- **Propósito:** Rama principal que sirve como la línea base del proyecto.
- **Últimos cambios:** Configuración inicial de Android con ajustes en la configuración de Appium y soporte para ejecución sin interfaz gráfica (headless). Esta rama contiene una test muy basico de como ejecutar una prueba basica en Android.
- **Nota:** Este ejemplo no genera reportes.


### `android-ios`
- **Propósito:** Diseñada específicamente para manejar pruebas en dispositivos Android e iOS usando un solo archivo Serenity.conf por medio de la cual se puede ejecutar en ambos dispositivos. El comando de ejecucion en esta rama es
- Android
  --`gradle clean test -Denvironment=android aggregate reports`
- iOS
  --`gradle clean test -Denvironment=ios aggregate reports`

### `circleci`
- **Propósito:** Integración continua y pruebas automatizadas utilizando CircleCI, tiene los mismos Test de la rama de **android-ios**.
- **Últimos cambios:** Ajustes en `DisplayName` en pruebas y limpieza de librerías innecesarias.

### `cucumber`
- **Propósito:** Automatizacion realizada en Android pero usando Cucumber

### `ejemplo-ios`
- **Propósito:** Contiene ejemplos de automatización para dispositivos iOS. Configuración inicial de iOS con ajustes en la configuración de Appium. Es el test basico como lo esta en la rama main.
- **Nota:** Este ejemplo no genera reportes.

### `jenkins`
- **Propósito:** Configuración para la integración continua y despliegues utilizando Jenkins utilizando Docket. Se carga el Dockerfile, docker-compose y ajustes necesarios para su ejecucion.

### `screenplay`
- **Propósito:** Implementación del patrón Screenplay para pruebas más legibles y reutilizables.
- **Últimos cambios:** Configuración detallada de dependencias, tareas y pruebas para Android utilizando el patrón Screenplay.
---

Si tienes problemas o preguntas con el repositorio, por favor escriba su pregunta en la seccion de [Issues](https://github.com/qa-conf/mobile-appium-automation-serenitybdd/issues "Issues") dentro de este repositorio para ayudarte a solucionar el error.

#### Juan Fernandez
##### QAConf Instructor
