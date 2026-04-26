pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/Suhas8349/my-gradle-app.git'
            }
        }

        stage('Build') {
            steps {
                dir('devops-gradle') {
                    sh 'chmod +x gradlew'
                    sh './gradlew build'
                }
            }
        }

        stage('Test') {
            steps {
                dir('devops-gradle') {
                    sh './gradlew test'
                }
            }
        }

        stage('Run Application') {
            steps {
                dir('devops-gradle') {
                    sh './gradlew run'
                }
            }
        }
    }
}
