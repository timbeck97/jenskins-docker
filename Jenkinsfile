pipeline {
    agent any
    tools{
        maven "maven"
    }
    stages {

        stage('docker build') {
            steps {
                bat 'docker build -t timbeck1997/jenkins-docker-v1 .'
            }
        }
        stage('docker stop container'){
            steps{
                bat "docker stop timbeck1997/jenkins-docker-v1"
                bat "docker rm timbeck1997/jenkins-docker-v1"
            }
        }
        stage('docker run') {
            steps {
                bat 'docker run --name jenkins-docker-api -p 8089:8089 -itd timbeck1997/jenkins-docker-v1'

            }
        }

    }
}
