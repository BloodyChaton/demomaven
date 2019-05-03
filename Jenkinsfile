pipeline {
    agent any
    tools {
        maven 'maven'
    }      
    stages {
        stage('checkout') {
            steps {
               git branch: 'dev-rim', credentialsId: '7197d4b4-c813-448d-a674-aef48784d8f0', url: 'https://github.com/BloodyChaton/demomaven.git'
                echo 'checkout'
            }
        }
        stage ('Test') {
            steps{
                echo 'read test'
             sh 'mvn install'
                
            }
        }    
            
        stage ('deploy') {
            steps{
                echo 'deploy'
                sh 'mvn deploy'
               
            }
        }    
       
        
    }
}      
   

