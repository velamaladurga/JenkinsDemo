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
        }

        failure {
            echo 'CI Pipeline failed!'
        }
    }
}