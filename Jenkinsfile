pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/zakke-username/otp1-in-class-assignment.git'
            }
        }
        stage('Build and test') {
            steps {
                bat 'mvn clean verify'
            }
        }
        stage('Code coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }
        stage('Publish test results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish coverage report') {
            steps {
                jacoco()
            }
        }
    }
}