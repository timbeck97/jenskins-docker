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
                powershell 'docker stop $(docker ps -a -q)'
                powershell 'docker rm $(docker ps -a -q)'
            }
        }
        stage('docker run') {
            steps {
                bat 'docker run --name jenkins-docker-api -p 8089:8089 -itd timbeck1997/jenkins-docker-v1'

            }
        }

    }
}
