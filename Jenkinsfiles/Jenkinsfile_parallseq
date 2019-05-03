pipeline {
    agent any
    tools{ maven 'Maven' }
    stages {
      stage ('echo') {      
        steps {echo "Hello 1st non sequentialstage"}
                       }

      stage ('Maven') {
        stages {
           stage ('checkout') {
               steps {
            echo "$maven"                }
                                }
            stage ('maven1') {
               steps {
               echo "Maven 1"
                     }
              }
              stage ('maven2') {
               steps {
               echo "Maven 2"
              }         
                                  }
                 }
       }
    
    stage ('Parallels') {
      parallel {
          stage ('step1'){
           steps {
echo "$maven step1"                      }
          }
       stage ('step2'){
           steps {
echo "$maven step 2"  
                                       }
          }
  }
}
    stage ('Parallels2') {
      parallel {
          stage ('step3'){
           steps {
                       echo "coucou"
                    }
          }
       stage ('step4'){
           steps {
                       echo "salut"
                    }
          }
  }
}   
}
}