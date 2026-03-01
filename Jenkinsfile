pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code from GitHub'
            }
        }

        stage('Build & Test') {
            steps {
                echo 'Running Maven tests'
                bat 'mvn clean test'
            }
        }
    }
}