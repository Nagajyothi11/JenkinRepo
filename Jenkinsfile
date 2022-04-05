pipeline 
{
    agent any

    stages 
    {
        stage('Check Out')
        {
            steps
            {
                echo 'Checking out'
            }
        }
    
        stage('Package') 
        {
            steps
            {
                bat 'mvn clean package'
            }
        }
        stage('sonar Analysis') 
        {
            steps 
            {
                withSonarQubeEnv('ZensarCodeAnalysis')
                {
                    bat 'mvn sonar:sonar'
            }
        }
        }
        stage('JaCoCo Report') 
        {
            steps 
            {
                jacoco()
            }
        }
        stage('Build Docker Image') 
        {
            steps 
            {
             bat 'docker build -t jyothi2022/test .' 
            }
        }
        stage('Push Docker Image to Docker Hub') 
        {
            steps 
            {
               echo 'Pushing Docker Image'
            }
        }
    }
    }  
    
