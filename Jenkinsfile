pipeline {
    agent any
    parameters {
        string(name: 'rim', defaultValue: 'Mr Jenkins', description: 'hello hajer')
         password(name: 'rima', defaultValue: 'SECRET', description: 'Enter a password')
    }     
       options {
        timeout(time: 1, unit: 'HOURS') 
         retry(2) 
    }
    stages {
        stage('checkout') {
            steps {
                echo 'checkout'
            }
        }
        stage ('Test') {
            steps{
                echo 'read test'
            }
        }    
            
        stage ('deploy') {
            steps{
                echo 'deploy'
               
            }
        }    
        stage ('en')  {
             environment { 
                AN_ACCESS_KEY = 'my-prefined-secret-text'
            }
            steps {
                 echo  "$AN_ACCESS_KEY"
            }
        }  
        stage ('par') {
            steps {
                echo "Hello ${params.rim}"
            }
            }
        stage('par1')    {
            steps{
                 echo "Password: ${params.rima}"
            }
        }
    }
}      
   

