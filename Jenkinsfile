pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Clone the repository from GitHub
                git 'https://github.com/your-username/SeleniumJenkinsExample.git'
            }
        }

        stage('Build') {
            steps {
                // Build the project with Maven
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run the tests
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            // Archive test results
            junit 'target/surefire-reports/*.xml'

            // Clean up workspace
            cleanWs()
        }
    }
}
