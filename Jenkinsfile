pipeline{
   agent any
   tools{ maven 'Maven'}

   stages {
        stage ('checkout') {
          steps {
             git credentialsId: '9cbaca88-64ed-4179-b704-ccf7e98d87e1', url: 'https://github.com/BloodyChaton/demomaven.git'
                }
        }
        stage ('maven') {
            steps {
            sh 'mvn install'
            } 
        }
    }
}
