pipeline {
    agent any

    stages {
        stage('---clean---') {
            steps {
            	sh "whoami"
                sh "mvn clean"
            }
        }
        stage('---test---') {
            steps {
                 sh "mvn test"
            }
        }
    }
}