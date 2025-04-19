pipeline {
    agent any

    tools {
        maven 'Maven 3.8.6'  // Use the name from "Global Tool Configuration" if different
    }

    stages {
        stage('Clone') {
            steps {
                git url: 'git@github.com:aaryanwadhawan7/SpringBoot-Employee-REST-API.git', credentialsId: '6e27bf59-dff6-442d-989e-989d8b88f982'
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
