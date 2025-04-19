pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {
        stage('Clone') {
            steps {
                git branch: 'main', url: 'git@github.com:aaryanwadhawan7/SpringBoot-Employee-REST-API.git', credentialsId: '6e27bf59-dff6-442d-989e-989d8b88f982'
            }
        }

        stage('Build') {
            steps {
                dir('employee-rest-api') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Test') {
            steps {
                dir('employee-rest-api') {
                    sh 'mvn test'
                }
            }
        }
    }
}
