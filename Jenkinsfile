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
                bat "docker ps -q --filter ancestor='timbeck1997/jenkins-docker-v1' | xargs -r docker stop"
                bat "docker rm -v $(docker ps -a -q -f status=exited)"
            }
        }
        stage('docker run') {
            steps {
                bat 'docker run --name jenkins-docker-api -p 8089:8089 -itd timbeck1997/jenkins-docker-v1'

            }
        }

    }
}
