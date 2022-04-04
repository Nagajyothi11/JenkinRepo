pipeline {
    agent any

    stages {
        stage('Check Out') {
            steps {
                echo 'Checking out'
            }
        }
    stages {
        stage('Package') {
            steps {
                bat 'mvn clean package'
            }
        }
        stages {
        stage('JaCoCo Report') {
            steps {
                jacoco()
            }
        }
        
    }
    
    
}
