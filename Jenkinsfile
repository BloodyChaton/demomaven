pipeline{
   agent none
   environment {
       CC ="coucou"
   }
   parameters {
       password(name:'PASSWORD', defaultValue: 'luc', description: 'Enter a password')
   }
   stages {
        stage ('checkout') {
          steps {
             git {credentialsId: '9cbaca88-64ed-4179-b704-ccf7e98d87e1', url: 'https://github.com/BloodyChaton/tpjenkins.git'}
                }
        }
        stage ('Stage2') {
            environment { CE="variable stage 2"}
            steps {
            echo "$CE"
            } 
        }
        stage ('Stage3') {
            steps {
            echo 'Hello World 3'
            } 
        }
    }
    post {
        success {
                echo 'Fin du build avec succès'
       }
    }
}
