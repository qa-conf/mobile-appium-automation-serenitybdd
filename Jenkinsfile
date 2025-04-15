pipeline {
    agent any
    environment {
        APPIUM_HOST = "host.docker.internal"
        ADB_HOST = "host.docker.internal"
    }
    stages {
        stage('Preparar') {
            steps {
                echo "Copiando proyecto desde /opt al workspace..."
                sh 'cp -R /opt/mobile-appium-automation-serenitybdd .'
                echo "Proyecto copiado al workspace: ${env.WORKSPACE}"
            }
        }
        stage('Build and Test') {
            steps {
                dir('mobile-appium-automation-serenitybdd') {
                    sh './gradlew clean test -Denvironment=android aggregate reports'
                }
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'target/site/serenity/**', allowEmptyArchive: true
            publishHTML ([
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'mobile-appium-automation-serenitybdd/target/site/serenity',
                reportFiles: 'index.html, serenity-summary.html',
                reportName: 'Reporte Serenity'
            ])
        }
    }
}
