pipeline {
    agent any

    tools {
        maven 'Maven 3.8.6'  // Use the name from "Global Tool Configuration" if different
    }

    stages {
        stage('Clone') {
            steps {
                git url: 'git@github.com:aaryanwadhawan7/SpringBoot-Employee-REST-API.git', credentialsId: '6242fa24-4011-43f9-b38a-d411daf61e2b'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
