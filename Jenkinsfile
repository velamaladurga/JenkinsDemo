pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat '''
                    set "MAVEN_HOME=C:\\maven\\apache-maven-3.9.16"
                    set "PATH=%MAVEN_HOME%\\bin;%PATH%"
                    call mvn clean compile
                '''
            }
        }

        stage('Test') {
            steps {
                bat '''
                    set "MAVEN_HOME=C:\\maven\\apache-maven-3.9.16"
                    set "PATH=%MAVEN_HOME%\\bin;%PATH%"
                    call mvn test
                '''
            }
        }

        stage('Package') {
            steps {
                bat '''
                    set "MAVEN_HOME=C:\\maven\\apache-maven-3.9.16"
                    set "PATH=%MAVEN_HOME%\\bin;%PATH%"
                    call mvn package
                '''
            }
        }
    }

    post {
        success {
            echo 'CI Pipeline completed successfully!'

            emailext(
                to: 'velamaladurga.23.cse@anits.edu.in',
                subject: "Jenkins Build Successful: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """The Jenkins CI pipeline completed successfully.

Job: ${env.JOB_NAME}
Build Number: ${env.BUILD_NUMBER}
Build URL: ${env.BUILD_URL}
"""
            )
        }

        failure {
            echo 'CI Pipeline failed!'

            emailext(
                to: 'velamaladurga.23.cse@anits.edu.in',
                subject: "Jenkins Build Failed: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """The Jenkins CI pipeline failed.

Job: ${env.JOB_NAME}
Build Number: ${env.BUILD_NUMBER}
Build URL: ${env.BUILD_URL}
"""
            )
        }
    }
}