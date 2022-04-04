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
             echo 'Building Docker image'   
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
    
