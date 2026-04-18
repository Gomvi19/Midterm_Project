pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out code'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t discount-calculator:latest .'
            }
        }

        // STAGING HERE
        stage('Deploy to Staging') {
            steps {
                bat 'docker rm -f discount-staging || true'
                bat 'docker run -d --name discount-staging discount-calculator:latest'
            }
        }

        stage('Staging Verification') {
            steps {
                bat 'docker logs discount-staging'
            }
        }

        // PRODUCTION HERE
        stage('Deploy to Production') {
            steps {
                input message: 'Approve deployment to PRODUCTION?'
                bat 'docker rm -f discount-production || true'
                bat 'docker run -d --name discount-production discount-calculator:latest'
            }
        }
    }
}