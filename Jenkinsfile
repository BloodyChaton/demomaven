pipeline{
   agent none
   environment {
       CC ="coucou"
   }
   parameters {
       password(name:'PASSWORD', defaultValue: 'luc', description: 'Enter a password')
   }
   stages {
        stage ('Stage1') {
        environment { CD="ceci est une variable spécifique au stage 1"}
        steps {
            echo "$CC"
            echo "$CD"
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