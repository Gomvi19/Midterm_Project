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
                        echo 'Building with Maven and running JUnit tests'
                        bat 'mvn clean package'
                    }
                }

                stage('Docker Build & Run') {
                    steps {
                        echo 'Building Docker image'
                        bat 'docker build -t discount-calculator:latest .'
                        echo 'Running Docker container'
                        bat 'docker run --rm -it discount-calculator:latest'
                    }
                }
    }
}