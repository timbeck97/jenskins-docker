pipeline {
    agent any
    tools{
        maven "maven"
    }
    stages {

        stage('docker build') {
            steps {
                 cmd_exec('docker build -t timbeck1997/jenkins-docker-v1 .')
            }
        }
        stage('docker run') {
            steps {
                 cmd_exec('docker run --name jenkins-docker-api -p 8089:8089 -itd timbeck1997/jenkins-docker-v1')

            }
        }

    }
}
